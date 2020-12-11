package net.decorator.demo.extra.impl;

import net.decorator.demo.extra.Decorator;
import net.decorator.demo.product.Product;

public class Small extends Decorator {

    public Small(Product product) {
        super(product, 0.5f);
    }

    public Float price() {
        return this.product.price() + this.price;
    }

    @Override
    public String toString() {
        return String.format("Small %s ", product);
    }
}
