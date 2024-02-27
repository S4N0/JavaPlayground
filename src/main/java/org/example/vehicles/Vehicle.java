package org.example.vehicles;

public class Vehicle {
    String color;
    int speed;

    public Vehicle(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    public String getColor(int i, String text) {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public String toString(){
        return "Vehicle[color="+color+", speed="+color+"]";
    }
}
