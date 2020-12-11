package net.decorator.demo.service;

import net.decorator.demo.product.Product;
import net.decorator.demo.product.impl.Coffee;
import net.decorator.demo.product.impl.Roll;
import net.decorator.demo.service.impl.HappyHourPromotion;
import net.decorator.demo.service.impl.PercentagePromotion;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PromotionTest {

    @Test
    public void GivenPercentagePromotion_WhenPromoIs10percent_YouPay90OfTotal() {

        //Given
        List<Product> products = Arrays.asList(new Roll(), new Coffee());
        Promotion promotion = new PercentagePromotion(10f);

        Float beforePrice = products.stream()
                .map(Product::price)
                .reduce(Float::sum)
                .orElse(0f);


        //When
        Float discountedPrice = promotion.apply(beforePrice);

        //Then
        assertNotNull(discountedPrice);
        assertEquals(0.9f, (discountedPrice / beforePrice), 0f);

    }

    @Test
    public void GivenHappyHourPromotion_WhenPromoIs20percent_YouPay80OfTotal() {

        //Given
        List<Product> products = Arrays.asList(new Roll(), new Coffee());

        Promotion promotion = new HappyHourPromotion(LocalDateTime.now(), LocalDateTime.now().plusHours(1), 20f);

        Float beforePrice = products.stream()
                .map(Product::price)
                .reduce(Float::sum)
                .orElse(0f);


        //When
        Float discountedPrice = promotion.apply(beforePrice);

        //Then
        assertNotNull(discountedPrice);
        assertEquals(0.8f, (discountedPrice / beforePrice), 0f);

    }
}
