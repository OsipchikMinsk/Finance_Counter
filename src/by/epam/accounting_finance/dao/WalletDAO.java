package by.epam.accounting_finance.dao;

import by.epam.accounting_finance.beans.Wallet;

import java.util.List;

public interface WalletDAO  {
    //create
    void addWallet (Wallet wallet) throws DAOException;

    //read
    void getWalletByID (long ID) throws DAOException;

    //update
    void updateWallet (Wallet wallet) throws DAOException;

    //delete
    void deleteWallet (Wallet wallet) throws DAOException;

    List<Wallet> findWalletsByID (long ID) throws DAOException;
}
