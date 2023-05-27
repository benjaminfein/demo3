package com.example.demo.model.Transoprt;

import com.example.demo.service.TransportService.PlaneService;

public final class Fighter extends Plane{
    private int aircraftGeneration;
    private String armament;

    public String generationInfo() {
        return "Generation of this aircraft is " + aircraftGeneration + "th";
    }

    public Fighter(int speed, String weight, int quantityOfPassengerSeats, String price, int numberOfFlight, int aircraftGeneration, String armament) {
        super(speed, weight, quantityOfPassengerSeats, price, numberOfFlight);
        this.aircraftGeneration = aircraftGeneration;
        this.armament = armament;
    }

    @Override
    public String toString() {
        return "Fighter{" + "\n" +
                "speed=" + getSpeed() + "km/h" + ", " + "\n" +
                "Stroke speed is: " + strokeSpeed(getSpeed()) + " mach" + ", " + "\n" +
                "weight='" + getWeight() + '\'' + ", " + "\n" +
                "quantityOfPassengerSeats=" + getQuantityOfPassengerSeats() + ", " + "\n" +
                "price='" + getPrice() + '\'' + ", " + "\n" +
                "aircraftGeneration=" + aircraftGeneration + ", " + "\n" +
                "armament='" + armament + '\'' + ", " + "\n" +
                isVehicleSpeedMoreThanSpeedOfSound() + ", " + "\n" +
                isPlaneUnmanned() + ", " + "\n" +
                generationInfo() + ", " + "\n" +
                "Time of movement along the equator around the Earth ~ " +
                calculationOfTheTimeOfMovementAlongTheEquatorAroundTheEarth(getSpeed()) + " hours" + ", "  + "\n" +
                route(getNumberOfFlight()) + ", " + "\n" +
                PlaneService.attention() + "\n" +
                '}';
    }

    public int getAircraftGeneration() {
        return aircraftGeneration;
    }

    public void setAircraftGeneration(int aircraftGeneration) {
        this.aircraftGeneration = aircraftGeneration;
    }

    public String getArmament() {
        return armament;
    }

    public void setArmament(String armament) {
        this.armament = armament;
    }
}
