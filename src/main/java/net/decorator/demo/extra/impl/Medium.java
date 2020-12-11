package net.decorator.demo.extra.impl;

import net.decorator.demo.extra.Decorator;
import net.decorator.demo.product.Product;

public class Medium extends Decorator {

    public Medium(Product product) {
        super(product, 1f);
    }

    public Float price() {
        return this.product.price() + this.price;
    }

    @Override
    public String toString() {
        return String.format("Medium %s ", product);
    }
}
