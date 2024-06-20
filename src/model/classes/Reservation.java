package model.classes;

import model.DataDummy;
import model.enums.ReservationStatus;

public class Reservation {
    private int idReservation;
    private int stayDay;
    private ReservationStatus status;
    private Room room;
    private Customer customer;
    private Payment paymentType;

    public Reservation(int idReservation, int stayDay, ReservationStatus status, Room room, Customer customer, Payment paymentType) {
        this.idReservation = idReservation;
        this.stayDay = stayDay;
        this.status = status;
        this.room = room;
        this.customer = customer;
        this.paymentType = paymentType;
    }

    public Payment getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Payment paymentType) {
        this.paymentType = paymentType;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void bookRoom(String tipeKamar) {
        this.room = DataDummy.getRoomMap().get(tipeKamar);
    }

    public void cancelBooking() {
        this.status = ReservationStatus.CANCELLED;
    }

    public boolean checkAvailability() {
        return status == ReservationStatus.PAID;
    }

    public int getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
    }

    public int getStayDay() {
        return stayDay;
    }

    public void setStayDay(int stayDay) {
        this.stayDay = stayDay;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }
}
