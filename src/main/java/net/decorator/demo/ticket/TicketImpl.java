package net.decorator.demo.ticket;

import net.decorator.demo.product.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class TicketImpl implements Ticket {

    private List<Product> order;

    public TicketImpl() {
        this.order = new ArrayList<Product>();
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
        this.total(order, totalAmount -> totalAmount); //you could apply some disscount here in the future before printing
        this.footer();

    }


    private void header() {
        System.out.println(String.format("\t*** TICKET\tDate: %s ***%n", LocalDate.now()));
    }

    private void body() {
        this.order.forEach(product -> System.out.println(String.format("\t- %s - (%.2f €)", product, product.price())));
    }

    /**
     * Calculates the total price amount. The totalConsumer let you handle the total prince in order
     * to apply discounts or any price manipulation before print it
     *
     * @param order
     * @param totalFunction
     */
    private void total(List<Product> order, Function<Float, Float> totalFunction) {

        Float sum = order
                .stream()
                .map(Product::price)
                .reduce(Float::sum)
                .orElse(0f);

        Float total = totalFunction.apply(sum);

        System.out.println(String.format("\n\t\t\t\tTOTAL: %.2f €", total));
    }

    private void footer() {
        System.out.println(String.format("\n\t*** THANKS FOR YOUR VISIT ***"));
    }

}
