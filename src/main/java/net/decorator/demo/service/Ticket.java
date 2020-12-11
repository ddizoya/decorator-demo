package net.decorator.demo.service;

import net.decorator.demo.product.Product;

public interface Ticket {

    Ticket add(Product product);

    void print();

    Ticket availablePromotions(Promotion... promotions);
}
