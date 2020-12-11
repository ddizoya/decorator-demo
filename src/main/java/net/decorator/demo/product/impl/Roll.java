package net.decorator.demo.product.impl;

import net.decorator.demo.product.Product;

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
