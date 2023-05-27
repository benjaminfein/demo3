package com.example.demo.service.ProductService;

public interface SportProductService extends ProductService {
    default int shippingCapacity(int length, int width, int height) {
        int shippingCapacity = (length + 2) * (width + 2) * (height + 2);
        return shippingCapacity;
    }

    default String boxSizeCalculation(int shippingCapacity) {
        float capacityInLitres = (float)shippingCapacity / 1000;
        if (capacityInLitres < 1.0f) {
            return "Small box recommended";
        } else if (capacityInLitres < 5.0f) {
            return "Medium box recommended";
        } else {
            return "Big box recommended";
        }
    }
}
