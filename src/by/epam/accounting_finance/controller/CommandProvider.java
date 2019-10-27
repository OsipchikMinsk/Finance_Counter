package by.epam.accounting_finance.controller;

import by.epam.accounting_finance.controller.command.Command;
import by.epam.accounting_finance.controller.command.CommandType;
import by.epam.accounting_finance.controller.command.impl.*;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
    private final Map<CommandType, Command> repository = new HashMap<>();

    CommandProvider(){
        repository.put(CommandType.AUTHORIZATION, new Authorization());
        repository.put(CommandType.ADD_WALLET, new AddWallet());
        repository.put(CommandType.DELETE_WALLET, new DeleteWallet());
        repository.put(CommandType.READ_WALLET, new ReadWallet());
        repository.put(CommandType.UPDATE_WALLET, new UpdateWallet());
        repository.put(CommandType.WRONG_REQUEST, new WrongRequest());

    }
    Command getCommand (String name){
        CommandType commandType=null;
        Command command = null;
        try {
            commandType = CommandType.valueOf(name.toUpperCase());
            command = repository.get(commandType);
        }catch (IllegalThreadStateException | NullPointerException e){
            command = repository.get(CommandType.WRONG_REQUEST);
        }
        return command;
    }

    Command getCommand (String name, Double value){
        CommandType commandType=null;
        Command command = null;
        try {
            commandType = CommandType.valueOf(name.toUpperCase());
            command = repository.get(commandType);
        }catch (IllegalThreadStateException | NullPointerException e){
            command = repository.get(CommandType.WRONG_REQUEST);
            command.setValue(value);
        }
        return command;
    }
}
