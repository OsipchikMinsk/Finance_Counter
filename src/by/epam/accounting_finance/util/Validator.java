package by.epam.accounting_finance.util;

public class Validator {
    public static boolean isValidLogData(String login, String password) {
        return login.length() > 0 && password.length() > 0;
    }

    public static boolean isValidTransactionData(long amount, double operationSum, String date) {
        return amount > 0 && operationSum > 0 && date.length() > 0;
    }

    public static boolean isValidTransactionRequest(String[] request) {
        return request.length == 4;
    }
}
