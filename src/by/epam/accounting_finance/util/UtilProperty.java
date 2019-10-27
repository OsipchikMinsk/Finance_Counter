package by.epam.accounting_finance.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UtilProperty {
    public static String getPropertyValue(String propertyName) {
        FileInputStream fis;
        String propertyValue = " ";
        Properties properties = new Properties();
        try  {
            fis = new FileInputStream("src\\by\\epam\\accounting_finance\\resources\\application.property");
            properties.load(fis);
            propertyValue = properties.getProperty(propertyName);
        } catch (IOException e) {
            System.out.println("Ошибка, файл свойств отсутствует");
        }
        return propertyValue;
    }

}
