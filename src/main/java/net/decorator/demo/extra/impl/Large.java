package net.decorator.demo.extra.impl;

import net.decorator.demo.extra.Decorator;
import net.decorator.demo.product.Product;

public class Large extends Decorator {

    public Large(Product product) {
        super(product, 1.5f);
    }

    public Float price() {
        return this.product.price() + this.price;
    }

    @Override
    public String toString() {
        return String.format("Large %s ", product);
    }
}
