package by.epam.accounting_finance.service.impl;

import by.epam.accounting_finance.service.AuthorizationService;
import by.epam.accounting_finance.util.UtilProperty;

public class AuthorizationServiceImpl implements AuthorizationService {



    @Override
    public boolean isAuthorized(String name, String password) {
        if (name != null && password != null) {
            if (name.equals(UtilProperty.getPropertyValue("user.login")) &&
                    password.equals(UtilProperty.getPropertyValue("user.password"))) {
                return true;
            }
        }
        return false;
    }
}
