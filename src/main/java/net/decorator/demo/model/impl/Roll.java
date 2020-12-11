package net.decorator.demo.model.impl;

import net.decorator.demo.model.Product;

public class Roll extends Product {

    public Roll() {
        super(2f);
    }

    public Roll(Float price) {
        super(price);
    }

    public Float price() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Roll";
    }
}
