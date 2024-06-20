package view;

import model.DataDummy;
import model.classes.Customer;
import model.classes.Payment;
import model.classes.Reservation;
import model.classes.Room;
import model.enums.ReservationStatus;

import javax.xml.crypto.Data;

public class HotelReservation {
    public static void main(String[] args) {
        // Assign Dummy Data
        DataDummy.setDummy();

        // bookRoom() Example
        int id = 10; //auto increment;
        int stayDay = 4;
        String roomType = "capsule";
        Room room = DataDummy.getRoomMap().get(roomType.toLowerCase());
        Customer cust = DataDummy.getCustomer();
        Payment payment = DataDummy.getOnlinePayment(); // Online payment for example
        ReservationStatus status = ReservationStatus.PAID;

        //Assign to Object & Map
        Reservation res = new Reservation(id, stayDay, status, room, cust, payment);
        DataDummy.getReservationMap().put(res.getIdReservation(), res);

        // cancelBook() Example
        DataDummy.getReservationMap().get(1).cancelBooking();
    }
}
