/**
 * Created by Apoorva Mittal on 11-08-2015.
 */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Assert;
import org.junit.Test;

public class VolumeTest {

    @Test
    public void isEqualTest( ){
        Volume volume1 = new Tbsp(1);
        Volume volume2 = new Tsp(3);
        assertTrue(volume1.isEqual(volume2));
    }

    @Test
    public void shouldConvertTbspToTsp(){
        Volume volume1 = new Tbsp(2);
        Assert.assertEquals(6, volume1.convertTo(new Tsp(1)).getValue(), 2);
    }

    @Test
    public void shouldConvertTspToTbsp(){
        Volume volume1 = new Tsp(6);
        Assert.assertEquals(2,volume1.convertTo(new Tbsp(1)).getValue(),2);
    }



}
