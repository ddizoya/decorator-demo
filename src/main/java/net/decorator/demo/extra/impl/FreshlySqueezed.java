package net.decorator.demo.extra.impl;

import net.decorator.demo.extra.Decorator;
import net.decorator.demo.product.Product;

public class FreshlySqueezed extends Decorator {

    public FreshlySqueezed(Product product) {
        super(product, 0.95f);
    }

    public Float price() {
        return this.product.price() + this.price;
    }

    @Override
    public String toString() {
        return String.format("Freshly Squeezed %s ", product);
    }
}
