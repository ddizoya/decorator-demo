package net.decorator.demo.extra.impl;

import net.decorator.demo.extra.Decorator;
import net.decorator.demo.product.Product;

public class ExtraMilk implements Decorator {

    private Product product;
    private Float basePrice = 0.3f;

    public ExtraMilk(Product product) {
        this.product = product;
    }

    public Float price() {
        return this.product.price() + this.basePrice;
    }

    @Override
    public String toString() {
        return String.format("Extra Milk %s ", product);
    }
}
