package com.example.demo.model.Transoprt;

import com.example.demo.service.TransportService.VehicleService;

public abstract class Vehicle implements VehicleService {
    private int speed;
    private String weight;

    public String isVehicleSpeedMoreThanSpeedOfSound() {
        if (this.speed == 1235) {
            return "The vehicle move at the speed of sound(1235km/h)";
        } else if (this.speed < 1235) {
            return "The vehicle move slower than the speed of sound";
        } else {
            return "The vehicle move higher than the speed of sound";
        }
    }

    public Vehicle(int speed, String weight) {
        this.speed = speed;
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
