package by.epam.accounting_finance;

import by.epam.accounting_finance.controller.Controller;


import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Controller controller = new Controller();
        String request = "AUTHORIZATION Admin 1234Admin4321";

        System.out.println(controller.executeTask(request));


    }
}
