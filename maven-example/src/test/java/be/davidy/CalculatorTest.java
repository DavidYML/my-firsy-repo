package be.davidy;

import org.junit.Assert;
import org.junit.Test;

import static java.lang.Math.random;

/**
 * Created by jonsnow on 23/06/16.
 */
public class CalculatorTest {


    @Test
    public void multiplicationOfFactorsFieldProductFactor () {
        Assert.assertEquals(40, new Calculator().multiply(5, 8 ));

        random();
    }
}
