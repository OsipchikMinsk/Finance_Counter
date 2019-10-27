package by.epam.accounting_finance.service;

public class ServiceException extends Exception {

    private static final long serialVersionUID = 4L;

    public ServiceException (){
        super();
    }
    public ServiceException (String message){
        super(message);
    }
    public ServiceException (String message, Exception e){
        super(message,e);
    }
}
