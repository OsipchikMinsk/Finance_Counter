package by.epam.accounting_finance.dao.impl;

import by.epam.accounting_finance.beans.Transaction;
import by.epam.accounting_finance.dao.DAOException;
import by.epam.accounting_finance.dao.TransactionDAO;
import java.util.List;

public class FileTransactionDao implements TransactionDAO {


    @Override
    public void addTransaction(Transaction transaction) throws DAOException {

    }

    @Override
    public List<Transaction> getTransactionByDate(String date) throws DAOException {
        return null;
    }

    @Override
    public void updateTransaction(Transaction transaction) throws DAOException {

    }

    @Override
    public void deleteTransaction(Transaction Transaction) throws DAOException {

    }
}
