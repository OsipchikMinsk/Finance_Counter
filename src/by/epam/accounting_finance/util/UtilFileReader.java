package by.epam.accounting_finance.util;

import by.epam.accounting_finance.dao.DAOException;

import java.io.Closeable;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class UtilFileReader implements Closeable {

    public static List<String> readFile (String path) throws DAOException{

        List<String> fileData = new ArrayList<>();
        try {
            fileData = Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            throw new DAOException(e);
        }
        return fileData;
    }

    @Override
    public void close() throws IOException {

    }
}
