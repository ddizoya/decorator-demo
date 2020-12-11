package net.decorator.demo.model.impl;

import net.decorator.demo.model.Product;

public class Coffee extends Product {

    public Coffee() {
        super(2f);
    }

    public Coffee(Float price) {
        super(price);
    }

    public Float price() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Coffee";
    }
}
