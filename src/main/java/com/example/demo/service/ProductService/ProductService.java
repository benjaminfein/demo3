package com.example.demo.service.ProductService;

public interface ProductService {
    default int shippingCost(int weight) {
        if (weight < 10) {
            return weight * 2;
        } else if (weight > 10 && weight < 20) {
            return weight * 5;
        } else {
            return weight * 10;
        }
    }

    default int shippingWeightCalculate(int weight) {
        int packageWeight = weight + 1;
        return packageWeight;
    }
}
