package by.epam.accounting_finance.beans;

import java.io.Serializable;
import java.util.Objects;

public class Wallet implements Serializable {

    private static final long serialVersionUID = 2L;
    private double balance;
    private boolean blocked;
    private long walletID;
    private TypeOfWallet typeOfWallet;

    public Wallet(double balance, long walletID, TypeOfWallet typeOfWallet) {
        this.balance = balance;
        this.walletID = walletID;
        this.typeOfWallet = typeOfWallet;
        if (balance < 0) {
            this.blocked = true;
        } else {
            this.blocked = false;
        }
    }

    public Wallet() {
    }

    public long getWalletID() {
        return walletID;
    }

    public void setWalletID(long walletID) {
        this.walletID = walletID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public TypeOfWallet getTypeOfWallet() {
        return typeOfWallet;
    }

    public void setTypeOfWallet(TypeOfWallet typeOfWallet) {
        this.typeOfWallet = typeOfWallet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wallet wallet = (Wallet) o;
        return Double.compare(wallet.balance, balance) == 0 &&
                blocked == wallet.blocked &&
                walletID == wallet.walletID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(balance, blocked, walletID);
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "balance=" + balance +
                ", blocked=" + blocked +
                ", walletID=" + walletID +
                '}';
    }
    enum TypeOfWallet{
        RUB, DOLLAR, EURO
    }
}
