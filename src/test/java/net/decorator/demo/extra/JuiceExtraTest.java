package net.decorator.demo.extra;

import net.decorator.demo.model.Product;
import net.decorator.demo.model.decorator.impl.FreshlySqueezed;
import net.decorator.demo.model.decorator.impl.Orange;
import net.decorator.demo.model.impl.Juice;
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
