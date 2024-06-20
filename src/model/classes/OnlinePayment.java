package model.classes;

import java.util.Date;

public class OnlinePayment extends Payment {
    private String serviceProvider;

    public OnlinePayment(int transactionNumber, double amount, Date dateOfTransaction, String serviceProvider) {
        super(transactionNumber, amount, dateOfTransaction);
        this.serviceProvider = serviceProvider;
    }

    public String getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }
}
