package by.epam.accounting_finance.beans;


import java.io.Serializable;
import java.util.Objects;

public class Transaction implements Serializable {
    private static final long serialVersionUID = 2L;

    private long amount;
    private Double operationSum;
    private String date;

    public Transaction(long amount, Double operationSum, String date) {
        this.amount = amount;
        this.operationSum = operationSum;
        this.date = date;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public Double getOperationSum() {
        return operationSum;
    }

    public void setOperationSum(Double operationSum) {
        this.operationSum = operationSum;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return amount == that.amount &&
                Objects.equals(operationSum, that.operationSum) &&
                Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, operationSum, date);
    }
}
