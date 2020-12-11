package net.decorator.demo.service.impl;

import net.decorator.demo.service.Promotion;

import java.time.LocalDateTime;

public class HappyHourPromotion extends Promotion {

    private final LocalDateTime fromDate;
    private final LocalDateTime toDate;
    private final Float percentage;

    public HappyHourPromotion(LocalDateTime fromDate, LocalDateTime toDate, Float percentage) {
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.percentage = percentage;
    }

    @Override
    public Float apply(Float originalPrice) {

        LocalDateTime today = LocalDateTime.now();
        if (today.isAfter(fromDate) && today.isBefore(toDate)) {
            return originalPrice * this.percentageToPay(percentage);
        }
        return originalPrice;
    }

    @Override
    public String toString() {
        return String.format("\t> Happy Hour discount of %s%s", this.percentage, "%");
    }
}
