package net.decorator.demo.model.decorator.impl;

import net.decorator.demo.model.Product;
import net.decorator.demo.model.decorator.Decorator;

public class Orange extends Decorator {

    public Orange(Product product) {
        super(product, 1f);
    }

    public Float price() {
        return this.product.price() + this.price;
    }

    @Override
    public String toString() {
        return String.format("Orange %s ", product);
    }
}
