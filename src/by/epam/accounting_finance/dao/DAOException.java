package by.epam.accounting_finance.dao;

public class DAOException extends Exception {

    private static final long serialVersionUID = 3L;
    public DAOException (){
        super();
    }
    public DAOException (String message){
        super(message);
    }
    public DAOException (String message, Exception e){
        super(message,e);
    }
}
