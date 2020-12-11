package net.decorator.demo;

import net.decorator.demo.extra.impl.*;
import net.decorator.demo.product.impl.Coffee;
import net.decorator.demo.product.impl.Juice;
import net.decorator.demo.product.impl.Roll;
import net.decorator.demo.service.Promotion;
import net.decorator.demo.service.impl.HappyHourPromotion;
import net.decorator.demo.service.impl.PercentagePromotion;
import net.decorator.demo.service.impl.TicketImpl;

import java.time.LocalDateTime;

public class App {

    public static void main(String[] args) {

        Promotion percetagePromo = new PercentagePromotion(10.0f);
        Promotion happyHourPromotion = new HappyHourPromotion(LocalDateTime.now(), LocalDateTime.now().plusDays(1), 30f);

        new TicketImpl()
                .availablePromotions(percetagePromo, happyHourPromotion)
                .add(new FreshlySqueezed(new Orange(new Juice())))
                .add(new Bacon(new Roll()))
                .add(new FoamedMilk(new Medium(new Coffee())))
                .add(new Small(new Coffee()))
                .add(new ExtraMilk(new Large(new Coffee())))
                .print();

    }
}
