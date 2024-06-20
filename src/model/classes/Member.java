package model.classes;

import model.enums.CustomerType;

public class Member extends Customer{
    private double balance;
    private CustomerType type;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public CustomerType getType() {
        return type;
    }

    public void setType(CustomerType type) {
        this.type = type;
    }
}
