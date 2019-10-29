package by.epam.accounting_finance.dao;

import by.epam.accounting_finance.beans.Transaction;


import java.util.List;

public interface TransactionDAO {
    //create
    boolean addTransaction (Transaction transaction) throws DAOException;

    //read
   List<Transaction> getTransactionByDate (String date) throws DAOException;

    //update
    void updateTransaction (Transaction transaction) throws DAOException;

    //delete
    boolean deleteTransaction (Transaction Transaction) throws DAOException;


}
