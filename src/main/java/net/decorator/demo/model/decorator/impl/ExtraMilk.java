package net.decorator.demo.model.decorator.impl;

import net.decorator.demo.model.Product;
import net.decorator.demo.model.decorator.Decorator;

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
