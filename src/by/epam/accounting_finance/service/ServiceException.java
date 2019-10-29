package by.epam.accounting_finance.service;

import by.epam.accounting_finance.dao.DAOException;

public class ServiceException extends Exception {

    private static final long serialVersionUID = 4L;

    public ServiceException(DAOException e){
        super();
    }
    public ServiceException (String message){
        super(message);
    }
    public ServiceException(String message, Exception e){
        super(message,e);
    }
}
