package com.example.demo.model.Product;

import com.example.demo.service.ProductService.ProductService;

public abstract class Product implements ProductService {
    private String nameOfProduct;
    private String price;
    private int weight;

    public String shipping( ) {
        if (this.weight > 10f) {
            return "You can't take this product from shop by yourself shipping only";
        } else {
            return "You can take this product by yourself";
        }
    }

    public Product() {
    }

    public Product(String nameOfProduct, String price, int weight) {
        this.nameOfProduct = nameOfProduct;
        this.price = price;
        this.weight = weight;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
