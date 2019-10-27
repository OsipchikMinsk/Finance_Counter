package by.epam.accounting_finance;

import by.epam.accounting_finance.util.UtilProperty;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(UtilProperty.getPropertyValue("user.login"));
        System.out.println(UtilProperty.getPropertyValue("user.password"));
        String fileName = UtilProperty.getPropertyValue("path.file");


    }
}
