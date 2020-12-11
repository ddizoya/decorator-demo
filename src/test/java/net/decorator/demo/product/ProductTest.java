package net.decorator.demo.product;


import net.decorator.demo.model.Product;
import net.decorator.demo.model.impl.Coffee;
import net.decorator.demo.model.impl.Juice;
import net.decorator.demo.model.impl.Roll;
import org.junit.Assert;
import org.junit.Test;

public class ProductTest {

    @Test
    public void testRoll() {

        Product product = new Roll();

        Assert.assertNotNull(product);
        Assert.assertEquals(2f, product.price(), 0f);
    }

    @Test
    public void testJuice() {

        Product product = new Juice();

        Assert.assertNotNull(product);
        Assert.assertEquals(2f, product.price(), 0f);
    }

    @Test
    public void testCoffee() {

        Product product = new Coffee();

        Assert.assertNotNull(product);
        Assert.assertEquals(2f, product.price(), 0f);
    }

}
