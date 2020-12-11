package net.decorator.demo.extra;

import net.decorator.demo.model.Product;
import net.decorator.demo.model.decorator.impl.Bacon;
import net.decorator.demo.model.impl.Roll;
import org.junit.Assert;
import org.junit.Test;

public class RollExtraTest {

    @Test
    public void testBaconRoll() {

        Product product = new Bacon(new Roll());

        Assert.assertNotNull(product);
        Assert.assertEquals(4.5f, product.price(), 0f);
    }
}
