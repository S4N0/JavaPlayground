package org.example.vehicles;

class CarLot {
    Vehicle vehicleInLot;
    public CarLot(Vehicle givenVehicle) {
        vehicleInLot = givenVehicle;
    }

    public Vehicle returnACar() {
        // return Car object
        return vehicleInLot;
    }


}

