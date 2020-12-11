package net.decorator.demo.model.decorator.impl;

import net.decorator.demo.model.Product;
import net.decorator.demo.model.decorator.Decorator;

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
