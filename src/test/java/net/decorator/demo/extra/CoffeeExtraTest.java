package net.decorator.demo.extra;

import net.decorator.demo.extra.impl.*;
import net.decorator.demo.product.Product;
import net.decorator.demo.product.impl.Coffee;
import org.junit.Assert;
import org.junit.Test;

public class CoffeeExtraTest {

    @Test
    public void testSmallCoffee() {

        Product product = new Small(new Coffee());

        Assert.assertNotNull(product);
        Assert.assertEquals(2.5f, product.price(), 0f);
    }

    @Test
    public void testMediumCoffee() {

        Product product = new Medium(new Coffee());

        Assert.assertNotNull(product);
        Assert.assertEquals(3f, product.price(), 0f);
    }

    @Test
    public void testLargeCoffee() {

        Product product = new Large(new Coffee());

        Assert.assertNotNull(product);
        Assert.assertEquals(3.5f, product.price(), 0f);
    }

    @Test
    public void testExtraMilkSmallCoffee() {

        Product product = new ExtraMilk(new Small(new Coffee()));

        Assert.assertNotNull(product);
        Assert.assertEquals(2.8f, product.price(), 0f);
    }

    @Test
    public void testFoamedMilkSmallCoffee() {

        Product product = new FoamedMilk(new Small(new Coffee()));

        Assert.assertNotNull(product);
        Assert.assertEquals(3f, product.price(), 0f);
    }

    @Test
    public void testSpecialRoastSmallCoffee() {

        Product product = new SpecialRoast(new Small(new Coffee()));

        Assert.assertNotNull(product);
        Assert.assertEquals(3.4f, product.price(), 0f);
    }
}
