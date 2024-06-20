package model.classes;

import model.enums.RoomStatus;

public class Room {
    private String roomNumber;
    private int floor;
    private double price;
    private int capacity;
    private RoomStatus status;

    public Room(int capacity, double price, int floor, String roomNumber) {
        this.capacity = capacity;
        this.price = price;
        this.floor = floor;
        this.roomNumber = roomNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public RoomStatus getStatus() {
        return status;
    }

    public void setStatus(RoomStatus status) {
        this.status = status;
    }
}
