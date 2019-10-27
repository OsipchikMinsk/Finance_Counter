package by.epam.accounting_finance.service;

public interface AuthorizationService {
    boolean isAuthorized(String name, String password);
}
