package by.epam.accounting_finance.controller;

import by.epam.accounting_finance.beans.User;
import by.epam.accounting_finance.controller.command.Command;
import by.epam.accounting_finance.controller.command.impl.Authorization;
import by.epam.accounting_finance.dao.DAOException;
import by.epam.accounting_finance.dao.FileReaderDAO;
import by.epam.accounting_finance.dao.UserDAO;
import by.epam.accounting_finance.dao.impl.FileReaderDaoImpl;
import by.epam.accounting_finance.dao.impl.FileUserDaoImpl;
import by.epam.accounting_finance.util.UtilProperty;

import java.util.List;

public class Controller {

    private final char paramDelimeter = ' ';
    private final CommandProvider provider = new CommandProvider();
    private List<Command> commands;
    private User user = null;
    private UserDAO userDAO = new FileUserDaoImpl();
    private FileReaderDAO fileReaderDAO = new FileReaderDaoImpl();

    public void process() {
//        authData.substring(0,authData.indexOf(' ')); //todo испарамть везде
        String response = new Authorization().execute("sdfsdfsdf");  //todo путь к файлу
        if (!response.equals("Login or password wrong")) {
            try {
                user = userDAO.getUser(response);
            } catch (DAOException e) {
                e.printStackTrace();
            }
        }
        if (user != null) {

            String request = "ADD_WALLET 20"; //прочитанная команда из файла
            Command command = provider.getCommand(request.split(" ")[0], Double.valueOf(request.split(" ")[1]));
            //todo парсим остальноый фал и добавляем прочитанные команды!
        }

        commands.stream().forEach(command -> {
                command.execute(user.getName() + " ");
        });
    }

    private String executeTask(String request) {
        String commandType;
        Command executionCommand;
        // значение  команды до первого пробела
        commandType = request.substring(0, request.indexOf(paramDelimeter));
        executionCommand = provider.getCommand(commandType);
        String response;
        response = executionCommand.execute(request);
        return response;
    }
}
