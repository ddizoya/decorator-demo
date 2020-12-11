package net.decorator.demo.model.decorator.impl;

import net.decorator.demo.model.Product;
import net.decorator.demo.model.decorator.Decorator;

public class FoamedMilk extends Decorator {

    public FoamedMilk(Product product) {
        super(product, 0.5f);
    }

    public Float price() {
        return this.product.price() + this.price;
    }

    @Override
    public String toString() {
        return String.format("Foamed Milk %s ", product);
    }
}
