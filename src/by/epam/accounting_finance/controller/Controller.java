package by.epam.accounting_finance.controller;


import by.epam.accounting_finance.controller.command.Command;


public class Controller {

    private final char paramDelimeter = ' ';
    private final CommandProvider provider = new CommandProvider();

    public String executeTask(String request) {
        //AUTHORIZATION Admin 1234Admin4321
        System.out.println(request);
        String commandType;
        Command executionCommand;
        commandType = request.substring(0, request.indexOf(paramDelimeter));
        executionCommand = provider.getCommand(commandType);
        String response;
        response = executionCommand.execute(request);
        return response;
    }
}
