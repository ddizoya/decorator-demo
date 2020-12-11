package net.decorator.demo.model.decorator.impl;

import net.decorator.demo.model.Product;
import net.decorator.demo.model.decorator.Decorator;

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
