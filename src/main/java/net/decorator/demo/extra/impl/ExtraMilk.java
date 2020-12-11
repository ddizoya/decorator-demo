package net.decorator.demo.extra.impl;

import net.decorator.demo.extra.Decorator;
import net.decorator.demo.product.Product;

public class ExtraMilk extends Decorator {

    public ExtraMilk(Product product) {
        super(product, 0.3f);
    }

    public Float price() {
        return this.product.price() + this.price;
    }

    @Override
    public String toString() {
        return String.format("Extra Milk %s ", product);
    }
}
