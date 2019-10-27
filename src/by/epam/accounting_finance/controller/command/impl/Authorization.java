package by.epam.accounting_finance.controller.command.impl;

import by.epam.accounting_finance.beans.User;
import by.epam.accounting_finance.controller.command.Command;
import by.epam.accounting_finance.dao.FileReaderDAO;
import by.epam.accounting_finance.dao.impl.FileReaderDaoImpl;
import by.epam.accounting_finance.service.AuthorizationService;
import by.epam.accounting_finance.service.ServiceException;
import by.epam.accounting_finance.service.ServiceFactory;
import by.epam.accounting_finance.service.UserService;
import by.epam.accounting_finance.util.UtilProperty;

import java.util.List;

public class Authorization implements Command {
    private String login = null;
    private String password = null;
    private String response = "Login or password wrong";

    private AuthorizationService authorizationService = ServiceFactory.getInstance().getAuthorizationService();

    @Override
    public String execute(String filePath) {
        FileReaderDAO fileReaderDAO = ServiceFactory.getInstance().getFileReaderDAO();
        String authData = fileReaderDAO.getAuthorizationData(filePath);
        if (authData != null && authData.split(" ").length > 1) {
            login = authData.split(" ")[0];
            password = authData.split(" ")[1];
        }
        if (authorizationService.isAuthorized(login, password)) {
            response = login;
        }
        return response;
    }
}
