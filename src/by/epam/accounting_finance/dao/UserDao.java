package by.epam.accounting_finance.dao;

import by.epam.accounting_finance.beans.User;

public interface UserDao {
    User getUser(String name);

    User save(User user);

    void delete(User user);
}