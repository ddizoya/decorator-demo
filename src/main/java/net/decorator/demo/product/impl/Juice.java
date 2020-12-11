package net.decorator.demo.product.impl;

import net.decorator.demo.product.Product;

public class Juice extends Product {

    public Juice() {
        super(2f);
    }

    public Juice(Float price) {
        super(price);
    }

    public Float price() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Juice";
    }
}
