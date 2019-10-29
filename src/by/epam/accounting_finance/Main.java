package by.epam.accounting_finance;

import by.epam.accounting_finance.controller.Controller;


import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Controller controller = new Controller();
        String request = "AUTHORIZATIOn Admin 1234Admin4321";
        String request1 = "ADD_TRANSACTIOn 2000 200 29.10.2019";
        String request2 = "DELETE_TRANSACTION 2000 264 29.10.2019";
        System.out.println(controller.executeTask(request));
        System.out.println(controller.executeTask(request1));
        System.out.println(controller.executeTask(request2));

    }
}
