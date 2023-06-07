package com.example.demo.service.TransportService;

public interface VehicleService {
    default int calculationOfTheTimeOfMovementAlongTheEquatorAroundTheEarth(int speed) {
        return 40075 / speed;
    }

    default float strokeSpeed(int speed) {
        return (float)speed * 816327 / 1000000000;
    }

    default String returnString() {
        return "qwerty";
    }
}
