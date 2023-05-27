package com.example.demo.service.TransportService;

public interface PlaneService {
    default String route(int numberOfFlight) {
        if (numberOfFlight == 1) {
            return "Tokyo - Singapore";
        } else if (numberOfFlight == 2) {
            return "New-York - Shanghai";
        } else {
            return "Mexico - Washington";
        }
    }

    static String attention() {
        return "Attention! The inspection of each aircraft must be carried " +
                "out every 12 years and its duration must be at least 30 days!";
    }
}
