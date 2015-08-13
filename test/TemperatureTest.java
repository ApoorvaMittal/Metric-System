/**
 * Created by Apoorva Mittal on 11-08-2015.
 */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Assert;
import org.junit.Test;

public class TemperatureTest {


    @Test
    public void shouldTestIsEqual(){
        Temperature temperature1 = new Fahrenheit(212);
        Temperature temperature2 = new Celsius(100);
        assertTrue(temperature1.isEqual(temperature2));
    }

    @Test
    public void shouldTestNotEqual(){
        Temperature temperature1 = new Fahrenheit(1);
        Temperature temperature2 = new Celsius(5);
        assertFalse(temperature1.isEqual(temperature2));
    }

    @Test
    public void shouldConvertCelsiusToFahrenheit(){
        Temperature temperature1 = new Celsius(0);
        Assert.assertEquals(32, temperature1.convertTo(new Fahrenheit(32)).getValue(),2);
    }

    @Test
    public void shouldConvertFahrenheitToCelsius(){
        Temperature temperature1 = new Fahrenheit(212);
        Assert.assertEquals(100, temperature1.convertTo(new Fahrenheit(32)).getValue(),2);
    }
}
