package model.classes;

import java.util.Date;

public class CardPayment extends Payment{
    private String cardNumber;
    private String cardType;

    public CardPayment(int transactionNumber, double amount, Date dateOfTransaction, String cardNumber, String cardType) {
        super(transactionNumber, amount, dateOfTransaction);
        this.cardNumber = cardNumber;
        this.cardType = cardType;
    }


    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
}
