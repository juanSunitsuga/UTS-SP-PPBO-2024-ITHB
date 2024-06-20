package view;

import model.DataDummy;
import model.classes.Customer;
import model.classes.Reservation;
import model.classes.Room;

import javax.xml.crypto.Data;

public class HotelReservation {
    public static void main(String[] args) {
        DataDummy.setDummy();
        //Contoh cancelBook()
        DataDummy.getReservationMap().get(1).cancelBooking();

        //Contoh bookRoom()
        int id = 10; //auto increment;
        int stayDay = 4;
        String roomType = "capsule";
        Room room = DataDummy.getRoomMap().get(roomType.toLowerCase());
        Customer cust = DataDummy.getCustomer();
//        ReservationStatus
    }
