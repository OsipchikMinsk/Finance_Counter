package by.epam.accounting_finance.service;

import by.epam.accounting_finance.beans.User;

import java.util.List;

public interface SerializationService {
    User getUserFromFile(String name);
}
