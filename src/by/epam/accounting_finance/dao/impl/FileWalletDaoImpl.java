package by.epam.accounting_finance.dao.impl;

import by.epam.accounting_finance.beans.Wallet;
import by.epam.accounting_finance.dao.DAOException;
import by.epam.accounting_finance.dao.DAOFactory;
import by.epam.accounting_finance.dao.WalletDAO;

import java.util.ArrayList;
import java.util.List;

public class FileWalletDaoImpl implements WalletDAO {
    @Override
    public void addWallet(Wallet wallet) throws DAOException {
        DAOFactory daoFactory = DAOFactory.getInstance();
        WalletDAO walletDAO = daoFactory.getFileWalletImpl();
        walletDAO.addWallet(wallet);

    }

    @Override
    public void getWalletByID(long ID) throws DAOException {
        DAOFactory daoFactory = DAOFactory.getInstance();
        WalletDAO walletDAO = daoFactory.getFileWalletImpl();
        walletDAO.getWalletByID(ID);

    }

    @Override
    public void updateWallet(Wallet wallet) throws DAOException {
        DAOFactory daoFactory =DAOFactory.getInstance();
        WalletDAO walletDAO = daoFactory.getFileWalletImpl();
        walletDAO.updateWallet(wallet);

    }

    @Override
    public void deleteWallet(Wallet wallet) throws DAOException {
        DAOFactory daoFactory = DAOFactory.getInstance();
        WalletDAO walletDAO = daoFactory.getFileWalletImpl();
        walletDAO.deleteWallet(wallet);

    }

    @Override
    public List<Wallet> findWalletsByID(long ID) throws DAOException {
        List<Wallet> walletsID = new ArrayList<>();
        DAOFactory daoFactory = DAOFactory.getInstance();
        WalletDAO walletDAO = daoFactory.getFileWalletImpl();
        walletsID.add((Wallet) walletDAO.findWalletsByID(ID)) ;
        return walletsID;
    }
}
