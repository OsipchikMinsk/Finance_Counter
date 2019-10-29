package by.epam.accounting_finance.service;

import by.epam.accounting_finance.beans.Transaction;

import java.util.List;


public interface TransactionService {
    //create
    void addTransaction (Transaction Transaction) throws ServiceException;

    //read
    List<Transaction>  getTransactionByDate (String date) throws ServiceException;

    //update
    void updateTransaction (Transaction transaction) throws ServiceException;

    //delete
    void deleteTransaction(Transaction transaction) throws ServiceException;

}
