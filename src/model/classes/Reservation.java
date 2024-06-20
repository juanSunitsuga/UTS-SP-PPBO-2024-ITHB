package model.classes;

import model.enums.ReservationStatus;

public class Reservation {
    private int idReservation;
    private int stayDay;
    private ReservationStatus status;

    public void bookRoom(){}
    public void cancelBooking(){}
    public void checkAvailability(){}

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
