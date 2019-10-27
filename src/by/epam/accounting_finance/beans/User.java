package by.epam.accounting_finance.beans;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable{

    private static final long serialVersionUID = 1L;

    private String name;
    private Wallet wallet;

    public User(String name, Wallet wallet) {
        this.name = name;
        this.wallet = wallet;
    }

    public User() {
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
