package net.decorator.demo.extra.impl;

import net.decorator.demo.extra.Decorator;
import net.decorator.demo.product.Product;

public class Bacon implements Decorator {

    private Product product;
    private Float basePrice = 2.5f;

    public Bacon(Product product) {
        this.product = product;
    }

    public Float price() {
        return this.product.price() + this.basePrice;
    }

    @Override
    public String toString() {
        return String.format("Bacon %s ", product);
    }
}
