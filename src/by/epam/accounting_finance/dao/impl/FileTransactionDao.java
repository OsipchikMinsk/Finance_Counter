package by.epam.accounting_finance.dao.impl;

import by.epam.accounting_finance.beans.Transaction;
import by.epam.accounting_finance.dao.DAOException;
import by.epam.accounting_finance.dao.TransactionDAO;
import by.epam.accounting_finance.util.UtilFileReader;
import by.epam.accounting_finance.util.UtilFileWriter;
import by.epam.accounting_finance.util.UtilProperty;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.FormatFlagsConversionMismatchException;
import java.util.List;
import java.util.regex.Pattern;

public class FileTransactionDao implements TransactionDAO {

    public static final String TRANSACTION_PATH = UtilProperty.getPropertyValue("path.file");
    public static final String DB_PATH = UtilProperty.getPropertyValue("path.fileDB");


    @Override
    public boolean addTransaction(Transaction transaction) throws DAOException {
        long amount = transaction.getAmount();
        double operationSum = transaction.getOperationSum();
        String date = transaction.getDate();
        String transactionData = amount + " " + operationSum + " " + date + "\n";
        return UtilFileWriter.isWriteData(DB_PATH, transactionData);
    }

    @Override
    public List<Transaction> getTransactionByDate(String date) throws DAOException {
        return null;
    }

    @Override
    public void updateTransaction(Transaction transaction) throws DAOException {

    }

    @Override
    public boolean deleteTransaction(Transaction transaction) throws DAOException {
        // DELETE_TRANSACTION 2000 200 29.10.2019
        List<String> dataFromFile = new ArrayList<>();

        long amount = transaction.getAmount();
        double operationSum = transaction.getOperationSum();
        String date = transaction.getDate();
        String transactionDataDelete = " " + amount + " " + operationSum + " " + date;
        PrintWriter printWriter;
        dataFromFile = UtilFileReader.readFile(TRANSACTION_PATH);
        Pattern pattern = Pattern.compile(transactionDataDelete, Pattern.CASE_INSENSITIVE);
        for (int i = 0; i < dataFromFile.size(); i++) {
            if (pattern.matcher(transactionDataDelete).find()) {
                dataFromFile.remove(i);
                break;
            }
        }
        return true;
    }
}
