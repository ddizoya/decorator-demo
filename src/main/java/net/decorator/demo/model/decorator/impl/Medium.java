package net.decorator.demo.model.decorator.impl;

import net.decorator.demo.model.Product;
import net.decorator.demo.model.decorator.Decorator;

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
