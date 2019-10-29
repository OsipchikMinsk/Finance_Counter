package by.epam.accounting_finance.controller.command.impl;

import by.epam.accounting_finance.beans.Transaction;
import by.epam.accounting_finance.controller.command.Command;
import by.epam.accounting_finance.service.ServiceException;
import by.epam.accounting_finance.service.ServiceFactory;
import by.epam.accounting_finance.service.TransactionService;
import by.epam.accounting_finance.util.Validator;

public class DeleteTransaction implements Command {

    public static final String DELETE_TRANSACTION_SUCCESSFUL = "Transaction deleted successful!";

    @Override
    public String execute(String request) {
        String response;
        String[] arrayData = request.split(" ");
        //DELETE_TRANSACTION 2000 200 29.10.2019
        if (!Validator.isValidTransactionRequest(arrayData)){
            response = AddTransaction.WRONG_REQUEST_ADD_TRANSACTION;
            return response;
        }
        long amount = Long.parseLong(arrayData[1]);
        double operationSum = Double.parseDouble(arrayData[2]);
        String date = arrayData[3];
        Transaction transaction = new Transaction(amount,operationSum,date);

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        TransactionService transactionService = serviceFactory.getTransactionService();

        try {
            if (transactionService.deleteTransaction(transaction)) {
                request = DELETE_TRANSACTION_SUCCESSFUL;
            } else {
                request = AddTransaction.WRONG_REQUEST_ADD_TRANSACTION;
            }
        } catch (ServiceException e) {
            request = AddTransaction.SERVICE_ERROR;
        }
        return request;
    }
}
