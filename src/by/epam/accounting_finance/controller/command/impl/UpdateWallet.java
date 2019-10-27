package by.epam.accounting_finance.controller.command.impl;

import by.epam.accounting_finance.controller.command.Command;

public class UpdateWallet implements Command {
    private Double value;

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public UpdateWallet(Double value) {

    }

    @Override
    public String execute(String request) {
        //todo олучаешь кошелек, и отнимаешь или прибавляешь value
        return null;
    }
}
