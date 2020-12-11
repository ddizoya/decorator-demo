package net.decorator.demo.service;

public abstract class Promotion {

    public abstract Float apply(Float originalPrice);

    protected Float percentageToPay(Float percentage) {
        if (percentage < 0f || percentage > 100f) {
            throw new IllegalArgumentException("Percentage has to be between 0 and 100");
        }
        return 1 - (percentage / 100f);
    }
}
