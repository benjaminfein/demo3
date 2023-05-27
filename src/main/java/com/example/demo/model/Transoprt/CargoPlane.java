package com.example.demo.model.Transoprt;

import com.example.demo.service.TransportService.PlaneService;

public final class CargoPlane extends Plane{
    private int loadCapacity;
    private String wingspan;

    public String typeOfCargoPlane() {
        if (this.loadCapacity < 25) {
            return "Cargo plane type: light";
        } else if (this.loadCapacity < 100) {
            return "Cargo plane type: medium";
        } else {
            return "Cargo plane type: heavy";
        }
    }

    public CargoPlane(int speed, String weight, int quantityOfPassengerSeats, String price, int numberOfFlight, int loadCapacity, String wingspan) {
        super(speed, weight, quantityOfPassengerSeats, price, numberOfFlight);
        this.loadCapacity = loadCapacity;
        this.wingspan = wingspan;
    }

    @Override
    public String toString() {
        return "CargoPlane{" + "\n" +
                "speed=" + getSpeed() + "km/h" + ", " + "\n" +
                "Stroke speed is: " + strokeSpeed(getSpeed()) + " mach" + ", " + "\n" +
                "weight='" + getWeight() + '\'' + ", " + "\n" +
                "quantityOfPassengerSeats=" + getQuantityOfPassengerSeats() + ", " + "\n" +
                "price='" + getPrice() + '\'' + ", " + "\n" +
                "loadCapacity=" + loadCapacity + "tons" + ", " + "\n" +
                "wingspan='" + wingspan + '\'' + ", " + "\n" +
                isVehicleSpeedMoreThanSpeedOfSound() + ", " + "\n" +
                isPlaneUnmanned() + ", " + "\n" +
                typeOfCargoPlane() + ", " + "\n" +
                "Time of movement along the equator around the Earth ~ " +
                calculationOfTheTimeOfMovementAlongTheEquatorAroundTheEarth(getSpeed()) + " hours" + ", " + "\n" +
                route(getNumberOfFlight()) + ", " + "\n" +
                PlaneService.attention() + "\n" +
                '}';
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public String getWingspan() {
        return wingspan;
    }

    public void setWingspan(String wingspan) {
        this.wingspan = wingspan;
    }
}
