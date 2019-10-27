package by.epam.accounting_finance.controller.command;

public interface Command {
     void setValue(Double value);
     String execute (String request);
}
