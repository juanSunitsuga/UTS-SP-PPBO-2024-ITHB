package model.classes;

import java.util.Date;

public abstract class Payment {
    private int transactionNumber;
    private double amount;
    private Date dateOfTransaction;

    public Payment(int transactionNumber, double amount, Date dateOfTransaction) {
        this.transactionNumber = transactionNumber;
        this.amount = amount;
        this.dateOfTransaction = dateOfTransaction;
    }

    public int getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(int transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDateOfTransaction() {
        return dateOfTransaction;
    }

    public void setDateOfTransaction(Date dateOfTransaction) {
        this.dateOfTransaction = dateOfTransaction;
    }
}
