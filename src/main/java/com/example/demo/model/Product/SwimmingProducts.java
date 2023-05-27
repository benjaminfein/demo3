package com.example.demo.model.Product;

public final class SwimmingProducts extends SportProducts{
    private String shape;
    private boolean uvProtection;

    public String beCareful() {
        if (this.uvProtection) {
            return "This item has UV Protection";
        } else {
            return "Be careful! This item doesn't have UV Protection";
        }
    }

    public SwimmingProducts(String nameOfProduct, String price, int weight, int lengthInCentimetres, int widthInCentimetres, int heightInCentimetres, String shape, boolean uvProtection) {
        super(nameOfProduct, price, weight, lengthInCentimetres, widthInCentimetres, heightInCentimetres);
        this.shape = shape;
        this.uvProtection = uvProtection;
    }

    @Override
    public String toString() {
        return "SwimmingProducts{" + "\n" +
                "nameOfProduct='" + getNameOfProduct() + '\'' + ", " + "\n" +
                "price='" + getPrice() + '\'' + ", " + "\n" +
                "weight=" + getWeight() + "kg" + ", " + "\n" +
                shipping() + ", " + "\n" +
                "lengthInCentimetres=" + getLengthInCentimetres() + ", " + "\n" +
                "widthInCentimetres=" + getWidthInCentimetres() + ", " + "\n" +
                "heightInCentimetres=" + getHeightInCentimetres() + ", " + "\n" +
                capacityCalculate() + ", " + "\n" +
                "Shipping capacity: " +
                shippingCapacity(getLengthInCentimetres(), getWidthInCentimetres(), getHeightInCentimetres()) +
                " cu.cm." + ", " + "\n" +
                boxSizeCalculation(shippingCapacity(getLengthInCentimetres(),
                        getWidthInCentimetres(), getHeightInCentimetres())) + ", " + "\n" +
                "shape='" + shape + '\'' + ", " + "\n" +
                beCareful() + ", " + "\n" +
                "Shipping weight will be: " + shippingCost(getWeight()) + "kg" + ", " + "\n" +
                "Price of shipping will be: " + shippingWeightCalculate(getWeight()) + "$" + ", " + "\n" +
                '}';
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public boolean isUvProtection() {
        return uvProtection;
    }

    public void setUvProtection(boolean uvProtection) {
        this.uvProtection = uvProtection;
    }
}
