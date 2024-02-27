package org.example.vehicles;

public class Car extends Vehicle {

    public int seats;

    public Car(String color, int speed, int seats) {
        super(color, speed);
        this.seats = seats;
    }

    public int getCarInfo() {
        return 100;
    }
}
