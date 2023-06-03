package com.example.demo.model.Product;

import com.example.demo.service.ProductService.SportProductService;

public abstract class SportProducts extends Product implements SportProductService {
    private int lengthInCentimetres;
    private int widthInCentimetres;
    private int heightInCentimetres;

    public String capacityCalculate() {
        return "Capacity: " + lengthInCentimetres * widthInCentimetres * heightInCentimetres + " cu.cm";
    }

    public SportProducts(String nameOfProduct, String price, int weight, int lengthInCentimetres, int widthInCentimetres, int heightInCentimetres) {
        super(nameOfProduct, price, weight);
        this.lengthInCentimetres = lengthInCentimetres;
        this.widthInCentimetres = widthInCentimetres;
        this.heightInCentimetres = heightInCentimetres;
    }

    public int getLengthInCentimetres() {
        return lengthInCentimetres;
    }

    public void setLengthInCentimetres(int lengthInCentimetres) {
        this.lengthInCentimetres = lengthInCentimetres;
    }

    public int getWidthInCentimetres() {
        return widthInCentimetres;
    }

    public void setWidthInCentimetres(int widthInCentimetres) {
        this.widthInCentimetres = widthInCentimetres;
    }

    public int getHeightInCentimetres() {
        return heightInCentimetres;
    }

    public void setHeightInCentimetres(int heightInCentimetres) {
        this.heightInCentimetres = heightInCentimetres;
    }
}
