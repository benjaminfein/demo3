package com.example.demo.model.Product;

public final class CyclingProducts extends SportProducts{
    private String material;
    private boolean productPurpose;
    private String typeOfCycling;

    public String productDestination() {
        if (this.productPurpose) {
            return "Product purpose is clothes and accessories";
        } else {
            return "Product purpose is bicycle parts";
        }
    }

    public CyclingProducts(String nameOfProduct, String price, int weight, int lengthInCentimetres,
                           int widthInCentimetres, int heightInCentimetres, String material, boolean productPurpose,
                           String typeOfCycling) {
        super(nameOfProduct, price, weight, lengthInCentimetres, widthInCentimetres, heightInCentimetres);
        this.material = material;
        this.productPurpose = productPurpose;
        this.typeOfCycling = typeOfCycling;
    }

    @Override
    public String toString() {
        return "CyclingProducts{" + "\n" +
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
                "material='" + material + '\'' + ", " + "\n" +
                productDestination() + ", " + "\n" +
                "typeOfCycling='" + typeOfCycling + '\'' + ", " + "\n" +
                "Shipping weight will be: " + shippingWeightCalculate(getWeight()) + "kg" + ", " + "\n" +
                "Price of shipping will be: " + shippingCost(getWeight()) + "$" + ", " + "\n" +
                '}';
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isProductPurpose() {
        return productPurpose;
    }

    public void setProductPurpose(boolean productPurpose) {
        this.productPurpose = productPurpose;
    }

    public String getTypeOfCycling() {
        return typeOfCycling;
    }

    public void setTypeOfCycling(String typeOfCycling) {
        this.typeOfCycling = typeOfCycling;
    }
}
