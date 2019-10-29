package by.epam.accounting_finance.controller;

import by.epam.accounting_finance.controller.command.Command;
import by.epam.accounting_finance.controller.command.CommandType;
import by.epam.accounting_finance.controller.command.impl.*;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
    private final Map<CommandType, Command> repository = new HashMap<>();

    CommandProvider(){
        repository.put(CommandType.AUTHORIZATION, new Authorization());
        repository.put(CommandType.ADD_TRANSACTION, new AddTransaction());
        repository.put(CommandType.DELETE_TRANSACTION, new DeleteTransaction());
        repository.put(CommandType.READ_TRANSACTION, new UpdateTransaction());
        repository.put(CommandType.UPDATE_TRANSACTION, new ReadTransaction());
        repository.put(CommandType.WRONG_REQUEST, new WrongRequest());

    }

    Command getCommand(String name) {
        CommandType commandType = null;
        Command command = null;
        try {
            System.out.println();
            commandType = CommandType.valueOf(name.toUpperCase());
            command = repository.get(commandType);
        } catch ( NullPointerException  | IllegalArgumentException e) {
            command = repository.get(CommandType.WRONG_REQUEST);
        }
        return command;
    }


}
