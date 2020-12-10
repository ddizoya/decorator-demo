package net.decorator.demo;

import net.decorator.demo.extra.impl.*;
import net.decorator.demo.product.impl.Coffee;
import net.decorator.demo.product.impl.Juice;
import net.decorator.demo.product.impl.Roll;
import net.decorator.demo.ticket.TicketImpl;

public class App {

    public static void main(String[] args) {

        new TicketImpl()
                .add(new FreshlySqueezed(new Orange(new Juice())))
                .add(new Bacon(new Roll()))
                .add(new FoamedMilk(new Medium(new Coffee())))
                .add(new Small(new Coffee()))
                .add(new ExtraMilk(new Large(new Coffee())))
                .print();
    }
}
