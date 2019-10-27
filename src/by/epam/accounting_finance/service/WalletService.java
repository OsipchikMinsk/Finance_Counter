package by.epam.accounting_finance.service;

import by.epam.accounting_finance.beans.Wallet;


public interface WalletService {
    //create
    void addWallet (Wallet wallet) throws ServiceException;

    //read
    void getWalletByID (long ID) throws ServiceException;

    //update
    void updateWallet (Wallet wallet) throws ServiceException;

    //delete
    void deleteWallet (Wallet wallet) throws ServiceException;

}
