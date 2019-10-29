package by.epam.accounting_finance.util;

import by.epam.accounting_finance.dao.DAOException;

import java.io.Closeable;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileWriter implements Closeable {

    public static boolean isWriteData (String path, String data) throws DAOException {
        boolean isWrite;
        try {
            Files.write(Paths.get(path), data.getBytes(), StandardOpenOption.APPEND);
            isWrite= true;
        } catch (IOException e) {
            isWrite = false;
            throw new DAOException(e);
        }
        return isWrite;
    }

    @Override
    public void close() throws IOException {

    }
}
