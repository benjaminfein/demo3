package com.example.demo.model.Transoprt;

import com.example.demo.service.TransportService.PlaneService;

public abstract class Plane extends Vehicle implements PlaneService {
    private int quantityOfPassengerSeats;
    private String price;
    private int numberOfFlight;

    public String isPlaneUnmanned() {
        if (this.quantityOfPassengerSeats == 0) {
            return "The plane is unmanned";
        } else {
            return "The plane isn't unmanned";
        }
    }

    public Plane(int speed, String weight, int quantityOfPassengerSeats, String price, int numberOfFlight) {
        super(speed, weight);
        this.quantityOfPassengerSeats = quantityOfPassengerSeats;
        this.price = price;
        this.numberOfFlight = numberOfFlight;
    }

    public int getQuantityOfPassengerSeats() {
        return quantityOfPassengerSeats;
    }

    public void setQuantityOfPassengerSeats(int quantityOfPassengerSeats) {
        this.quantityOfPassengerSeats = quantityOfPassengerSeats;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getNumberOfFlight() {
        return numberOfFlight;
    }

    public void setNumberOfFlight(int numberOfFlight) {
        this.numberOfFlight = numberOfFlight;
    }
}
