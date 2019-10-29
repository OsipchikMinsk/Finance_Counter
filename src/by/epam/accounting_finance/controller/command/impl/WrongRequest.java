package by.epam.accounting_finance.controller.command.impl;

import by.epam.accounting_finance.controller.command.Command;

public class WrongRequest implements Command {
  public static final String WRONG_REQUEST ="Warning incorrect request!";

    @Override
    public String execute(String request) {
        return WRONG_REQUEST;
    }
}
