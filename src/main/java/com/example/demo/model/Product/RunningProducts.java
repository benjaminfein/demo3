package com.example.demo.model.Product;

public final class RunningProducts extends SportProducts{
    private boolean hasAmortization;
    private boolean hasVentilation;

    public String amortizationInfo() {
        if (this.hasAmortization) {
            return "This item has amortization";
        } else {
            return  "This item hasn't amortization";
        }
    }

    public String ventilationInfo() {
        if (this.hasVentilation) {
            return "This item has ventilation";
        } else {
            return "This item hasn't ventilation";
        }
    }

    public RunningProducts(String nameOfProduct, String price, int weight, int lengthInCentimetres, int widthInCentimetres, int heightInCentimetres, boolean hasAmortization, boolean hasVentilation) {
        super(nameOfProduct, price, weight, lengthInCentimetres, widthInCentimetres, heightInCentimetres);
        this.hasAmortization = hasAmortization;
        this.hasVentilation = hasVentilation;
    }

    @Override
    public String toString() {
        return "RunningProducts{" + "\n" +
                "nameOfProduct='" + getNameOfProduct() + '\'' + ", " + "\n" +
                "price='" + getPrice() + '\'' + ", " + "\n" +
                "weight=" + getWeight() + "kg"  + ", " + "\n" +
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
                amortizationInfo() + ", " + "\n" +
                ventilationInfo() + ", " + "\n" +
                "Shipping weight will be: " + shippingCost(getWeight()) + "kg" + ", " + "\n" +
                "Price of shipping will be: " + shippingWeightCalculate(getWeight()) + "$" + ", " + "\n" +
                '}';
    }

    public boolean isHasAmortization() {
        return hasAmortization;
    }

    public void setHasAmortization(boolean hasAmortization) {
        this.hasAmortization = hasAmortization;
    }

    public boolean isHasVentilation() {
        return hasVentilation;
    }

    public void setHasVentilation(boolean hasVentilation) {
        this.hasVentilation = hasVentilation;
    }
}
