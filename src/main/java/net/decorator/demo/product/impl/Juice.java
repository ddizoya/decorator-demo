package net.decorator.demo.product.impl;

import net.decorator.demo.product.Product;

public class Juice implements Product {

    private float basePrice = 2f;

    public Float price() {
        return basePrice;
    }

    @Override
    public String toString() {
        return "Juice";
    }
}
