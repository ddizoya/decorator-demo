package net.decorator.demo.ticket;

import net.decorator.demo.product.Product;

public interface Ticket {

    Ticket add(Product product);

    void print();

}
