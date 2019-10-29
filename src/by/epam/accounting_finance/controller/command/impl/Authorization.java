package by.epam.accounting_finance.controller.command.impl;
import by.epam.accounting_finance.controller.command.Command;
import by.epam.accounting_finance.service.ServiceException;
import by.epam.accounting_finance.service.ServiceFactory;
import by.epam.accounting_finance.service.UserService;


public class Authorization implements Command {

    public static final String AUTHORIZATION_WELL = "Authorization well done!";
    public static final String AUTHORIZATION_INCORRECT = "Wrong password or login!";

    @Override
    public String execute(String request) {
        //AUTHORIZATION Admin 1234Admin4321
        String response = null;
        String login = request.split(" ")[1];
        String password = request.split(" ")[2];

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        UserService userService = serviceFactory.getUserService();

        try {
            if (userService.authorization(login, password)) {
                response = AUTHORIZATION_WELL;
            } else {
                response = AUTHORIZATION_INCORRECT;
            }
        } catch (ServiceException e) {
            e.printStackTrace();
        }
       return response;
    }
}
