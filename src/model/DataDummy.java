package model;

import model.classes.*;
import model.enums.CustomerType;
import model.enums.ReservationStatus;

import java.util.Date;
import java.util.HashMap;

public class DataDummy {
    private static HashMap<String, Room> roomMap = new HashMap<String, Room>();
    private static HashMap<Integer, Reservation> reservationMap = new HashMap<Integer, Reservation>();
    private static Customer customer = new Customer(1, "Dion", "dionisiuspr@gmail.com", "ITHB", true, new Member(CustomerType.VIP));

    public static void setDummy() {
        roomMap.put("basic", new Room(4, 1000000, 1, "101-103"));
        roomMap.put("suite", new Room(6, 1000000, 2, "201-203"));
        roomMap.put("deluxe", new Room(10, 1000000, 3, "301-303"));
        roomMap.put("capsule", new Room(2, 1000000, 4, "401-403"));

        Reservation[] reservation = {
                new Reservation(1, 1, ReservationStatus.PAID, roomMap.get("deluxe"), customer, onlinePayment),
                new Reservation(2, 3, ReservationStatus.PAID, roomMap.get("deluxe"), customer, onlinePayment),
                new Reservation(3, 1, ReservationStatus.PAID, roomMap.get("deluxe"), customer, cardPayment),
                new Reservation(4, 2, ReservationStatus.PAID, roomMap.get("deluxe"), customer, onlinePayment),
                new Reservation(5, 5, ReservationStatus.PAID, roomMap.get("deluxe"), customer, cardPayment),

        };
        reservationMap.put(customer.getIdCustomer(), reservation[0]);
        reservationMap.put(customer.getIdCustomer(), reservation[1]);
        reservationMap.put(customer.getIdCustomer(), reservation[2]);
        reservationMap.put(customer.getIdCustomer(), reservation[3]);
        reservationMap.put(customer.getIdCustomer(), reservation[4]);
    }

    private static Payment onlinePayment = new OnlinePayment(1023, roomMap.get("capsule").getPrice(), new Date(), "BankHB");
    private static Payment cardPayment = new CardPayment(1024, roomMap.get("capsule").getPrice(), new Date(), "hahahihi", "credit");

    public static HashMap<String, Room> getRoomMap() {
        return roomMap;
    }

    public static Payment getOnlinePayment() {
        return onlinePayment;
    }

    public static void setOnlinePayment(Payment onlinePayment) {
        DataDummy.onlinePayment = onlinePayment;
    }

    public static Payment getCardPayment() {
        return cardPayment;
    }

    public static void setCardPayment(Payment cardPayment) {
        DataDummy.cardPayment = cardPayment;
    }

    public static void setRoomMap(HashMap<String, Room> roomMap) {
        DataDummy.roomMap = roomMap;
    }

    public static HashMap<Integer, Reservation> getReservationMap() {
        return reservationMap;
    }

    public static void setReservationMap(HashMap<Integer, Reservation> reservationMap) {
        DataDummy.reservationMap = reservationMap;
    }

    public static Customer getCustomer() {
        return customer;
    }

    public static void setCustomer(Customer customer) {
        DataDummy.customer = customer;
    }
}
