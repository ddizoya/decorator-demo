package net.decorator.demo.extra.impl;

import net.decorator.demo.extra.Decorator;
import net.decorator.demo.product.Product;

public class SpecialRoast extends Decorator {

    public SpecialRoast(Product product) {
        super(product, 0.9f);
    }

    public Float price() {
        return this.product.price() + this.price;
    }

    @Override
    public String toString() {
        return String.format("Special Roast %s ", product);
    }
}
