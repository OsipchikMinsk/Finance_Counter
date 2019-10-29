package by.epam.accounting_finance.dao.impl;

import by.epam.accounting_finance.beans.Transaction;
import by.epam.accounting_finance.dao.DAOException;
import by.epam.accounting_finance.dao.TransactionDAO;
import by.epam.accounting_finance.util.FileWriter;
import by.epam.accounting_finance.util.UtilProperty;

import java.util.List;

public class FileTransactionDao implements TransactionDAO {

    public static final String TRANSACTION_PATH = UtilProperty.getPropertyValue("path.file");
    public static final String DB_PATH = UtilProperty.getPropertyValue("path.fileDB");



    @Override
    public boolean addTransaction(Transaction transaction) throws DAOException {
        long amount = transaction.getAmount();
        double operationSum = transaction.getOperationSum();
        String date = transaction.getDate();
        String transactionData = amount + " " + operationSum + " " + date + "\n";
        return FileWriter.isWriteData(DB_PATH, transactionData);
    }

    @Override
    public List<Transaction> getTransactionByDate(String date) throws DAOException {
        return null;
    }

    @Override
    public void updateTransaction(Transaction transaction) throws DAOException {

    }

    @Override
    public boolean deleteTransaction(Transaction Transaction) throws DAOException {

return true;
    }
}
