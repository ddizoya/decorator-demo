package net.decorator.demo.extra.impl;

import net.decorator.demo.extra.Decorator;
import net.decorator.demo.product.Product;

public class FoamedMilk implements Decorator {

    private Product product;
    private Float basePrice = 0.5f;

    public FoamedMilk(Product product) {
        this.product = product;
    }

    public Float price() {
        return this.product.price() + this.basePrice;
    }

    @Override
    public String toString() {
        return String.format("Foamed Milk %s ", product);
    }
}
