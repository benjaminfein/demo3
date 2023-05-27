package com.example.demo.model.Transoprt;

import com.example.demo.service.TransportService.PlaneService;

public final class PassengerPlane extends Plane{
    private int quantityOfEngines;
    private String color;

    private String typeOfPassengerPlane() {
        if (this.quantityOfEngines < 3) {
            return "It's small passenger plane";
        } else {
            return "It's big passenger plane";
        }
    }

    public PassengerPlane(int speed, String weight, int quantityOfPassengerSeats, String price, int numberOfFlight, int quantityOfEngines, String color) {
        super(speed, weight, quantityOfPassengerSeats, price, numberOfFlight);
        this.quantityOfEngines = quantityOfEngines;
        this.color = color;
    }

    @Override
    public String toString() {
        return "PassengerPlane{" +
                "speed=" + getSpeed() + "km/h" + ", " + "\n" +
                "Stroke speed is: " + strokeSpeed(getSpeed()) + " mach" + ", " + "\n" +
                "weight='" + getWeight() + '\'' + ", " + "\n" +
                "quantityOfPassengerSeats=" + getQuantityOfPassengerSeats() + ", " + "\n" +
                "price='" + getPrice() + '\'' + ", " + "\n" +
                "quantityOfEngines=" + quantityOfEngines + ", " + "\n" +
                "color='" + color + '\'' + ", " + "\n" +
                isVehicleSpeedMoreThanSpeedOfSound() + ", " + "\n" +
                isPlaneUnmanned() + ", " + "\n" +
                typeOfPassengerPlane() + ", " + "\n" +
                "Time of movement along the equator around the Earth ~ " +
                calculationOfTheTimeOfMovementAlongTheEquatorAroundTheEarth(getSpeed()) + " hours" + ", "  + "\n" +
                route(getNumberOfFlight()) + ", " + "\n" +
                PlaneService.attention() + "\n" +
                '}';
    }

    public int getQuantityOfEngines() {
        return quantityOfEngines;
    }

    public void setQuantityOfEngines(int quantityOfEngines) {
        this.quantityOfEngines = quantityOfEngines;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
