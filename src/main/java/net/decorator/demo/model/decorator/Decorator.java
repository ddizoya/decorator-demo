package net.decorator.demo.model.decorator;

import net.decorator.demo.model.Product;

public abstract class Decorator extends Product {

    protected Product product;

    public Decorator(Product product, Float price) {
        super(price);
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }
}
