package by.epam.accounting_finance.controller.command.impl;

import by.epam.accounting_finance.beans.Transaction;
import by.epam.accounting_finance.controller.command.Command;
import by.epam.accounting_finance.service.ServiceException;
import by.epam.accounting_finance.service.ServiceFactory;
import by.epam.accounting_finance.service.TransactionService;
import by.epam.accounting_finance.util.Validator;

public class AddTransaction implements Command {
    public static final String WRONG_REQUEST_ADD_TRANSACTION = "Incorrect request in add transaction!";
    public static final  String SUCCESSFUL_TRANSACTION_ADD = "Transaction added successful!";
    public static final String REJECTED_TRANSACTION_ADD = "Transaction rejected!";

    public  static  final  String SERVICE_ERROR = "Tray again latter!";
    @Override
    public String execute(String request) {

        String response;
        String[] arrayData = request.split(" ");
        //ADD_TRANSACTION 2000 200 29.10.2019
        if (!Validator.isValidTransactionRequest(arrayData)){
            response = WRONG_REQUEST_ADD_TRANSACTION;
            return response;
        }
        long amount = Long.parseLong(arrayData[1]);
        double operationSum = Double.parseDouble(arrayData[2]);
        String date = arrayData[3];
        //System.out.println(amount + " " + operationSum + " " + date    );
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        TransactionService transactionService = serviceFactory.getTransactionService();
        Transaction transaction = new Transaction(amount,operationSum,date);
        try {
            if(transactionService.addTransaction(transaction)){
                request = SUCCESSFUL_TRANSACTION_ADD;
            }else {
                request = REJECTED_TRANSACTION_ADD;
            }
        }catch (ServiceException e){
                request = SERVICE_ERROR;
        }
        return request;
    }
}
