package by.epam.accounting_finance.service.impl;

import by.epam.accounting_finance.beans.User;
import by.epam.accounting_finance.service.FileService;
import by.epam.accounting_finance.service.SerializationService;
import by.epam.accounting_finance.service.impl.FileServiceImpl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationServiceImpl implements SerializationService {
    private FileService fileService = new FileServiceImpl();

    @Override
    public User getUserFromFile(String name) {
        User user = null;
        try {
            byte[] userBytes = fileService.getUsersData(name);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(userBytes);
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            user = (User) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return user;
    }
}
