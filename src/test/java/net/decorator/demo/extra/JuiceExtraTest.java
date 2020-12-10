package net.decorator.demo.extra;

import net.decorator.demo.extra.impl.FreshlySqueezed;
import net.decorator.demo.extra.impl.Orange;
import net.decorator.demo.product.Product;
import net.decorator.demo.product.impl.Juice;
import org.junit.Assert;
import org.junit.Test;

public class JuiceExtraTest {

    @Test
    public void testOrangeJuice() {

        Product product = new Orange(new Juice());

        Assert.assertNotNull(product);
        Assert.assertEquals(3f, product.price(), 0f);
    }

    @Test
    public void testFreshlySqueezedOrangeJuice() {

        Product product = new FreshlySqueezed(new Orange(new Juice()));

        Assert.assertNotNull(product);
        Assert.assertEquals(3.95f, product.price(), 0f);
    }
}
