package net.decorator.demo.model.decorator.impl;

import net.decorator.demo.model.Product;
import net.decorator.demo.model.decorator.Decorator;

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
