package net.decorator.demo.service.impl;

import net.decorator.demo.model.Product;
import net.decorator.demo.service.Promotion;
import net.decorator.demo.service.Ticket;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketImpl implements Ticket {

    private List<Product> order;
    private List<Promotion> promotions;

    public TicketImpl() {
        this.order = new ArrayList<>();
        this.promotions = new ArrayList<>();
    }

    public Ticket add(Product product) {

        this.order.add(product);
        return this;
    }

    //TODO this should be a better option in order to print a ticket
    private class TicketDTO {
        public TicketDTO(List<Product> order) {
        }
    }

    //TODO this should be changed to TicketDTO in the future
    public void print() {

        //System.out.println(new TicketDTO(order));

        this.header();
        this.body();
        this.total(order); //you could apply some disscount here in the future before printing
        this.footer();

    }

    private Float appyPromotions(Float originalPrice) {

        return this.promotions
                .stream()
                .reduce(originalPrice, (aFloat, promotion) -> promotion.apply(aFloat), Float::sum);
    }

    @Override
    public Ticket availablePromotions(Promotion... promotions) {
        this.promotions.addAll(Arrays.asList(promotions));
        return this;
    }


    private void header() {
        System.out.println(String.format("\t*** TICKET\tDate: %s ***%n", LocalDate.now()));
    }

    private void body() {
        this.order.forEach(product -> System.out.println(String.format("\t- %s - (%.2f €)", product, product.price())));

        System.out.println(String.format("\n\t-----------------------------------"));
        this.promotions.forEach(System.out::println);
        System.out.println(String.format("\n\t-----------------------------------"));
    }

    private void total(List<Product> order) {


        Float totalPrice = order
                .stream()
                .map(Product::price)
                .reduce(Float::sum)
                .orElse(0f);

        Float discountedPrice = this.appyPromotions(totalPrice);

        System.out.println(String.format("\n\t\t\t\tTOTAL: %.2f €", discountedPrice));
    }


    private void footer() {
        System.out.println(String.format("\n\t*** THANKS FOR YOUR VISIT ***"));
    }

}
