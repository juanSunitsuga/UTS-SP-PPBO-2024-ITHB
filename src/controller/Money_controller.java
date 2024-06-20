package controller;

import model.DataDummy;
import model.classes.*;
import model.enums.CustomerType;

public class Money_controller {
    public static double processPayment(Reservation reserv, double price) {
        double payment = 0;
        Customer cust = reserv.getCustomer();
        if (reserv.getCustomer().isMember()) {
            if (reserv.getCustomer().getMember().getBalance() < price) {
                reserv.getCustomer().getMember().decreaseBalance(price);
                payment = reserv.getCustomer().getMember().getBalance() + price * 2 / 100;
                if (reserv.getPaymentType() instanceof CardPayment) {
                    payment += price * 2 / 100;
                }
            }

            if (reserv.getCustomer().getMember().getType() == CustomerType.VIP) {
                reserv.getCustomer().getMember().addBalance(price * 25 / 100);
            } else {
                reserv.getCustomer().getMember().addBalance(price * 10 / 100);
            }
        } else {
            payment = price + price * 2 / 100;
        }
        return payment;
    }

    public static double calculateTotalRevenue() {
        double revenue = 0;
        for (Reservation reservation : DataDummy.getReservationMap().values()) {
            revenue += reservation.getStayDay() * processPayment(reservation, reservation.getRoom().getPrice());
        }
        return revenue;
    }
}
