package net.decorator.demo.service.impl;

import net.decorator.demo.service.Promotion;

public class PercentagePromotion extends Promotion {

    private Float percentage;

    public PercentagePromotion(Float percentage) {
        this.percentage = percentage;
    }

    @Override
    public Float apply(Float originalPrice) {
        return originalPrice * this.percentageToPay(this.percentage);
    }

    @Override
    public String toString() {
        return String.format("\t> Applied discount of %s%s", this.percentage, "%");
    }

}
