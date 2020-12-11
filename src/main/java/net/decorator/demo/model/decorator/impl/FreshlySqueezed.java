package net.decorator.demo.model.decorator.impl;

import net.decorator.demo.model.Product;
import net.decorator.demo.model.decorator.Decorator;

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
