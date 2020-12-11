package net.decorator.demo.service;

import net.decorator.demo.model.Product;

public interface Ticket {

    Ticket add(Product product);

    void print();

    Ticket availablePromotions(Promotion... promotions);
}
