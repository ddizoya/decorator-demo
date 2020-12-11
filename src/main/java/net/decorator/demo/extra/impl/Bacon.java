package net.decorator.demo.extra.impl;

import net.decorator.demo.extra.Decorator;
import net.decorator.demo.product.Product;

public class Bacon extends Decorator {

    public Bacon(Product product) {
        super(product, 2.5f);
    }

    public Float price() {
        return this.product.price() + this.price;
    }

    @Override
    public String toString() {
        return String.format("Bacon %s ", product);
    }
}
