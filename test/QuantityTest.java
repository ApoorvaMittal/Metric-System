            /**
             * Created by Apoorva Mittal on 10-08-2015.
             */

            import static org.junit.Assert.assertEquals;
            import static org.junit.Assert.assertTrue;
            import static org.junit.Assert.assertFalse;

            import org.junit.Assert;
            import org.junit.Test;
            public class QuantityTest


            {
                @Test
                public void isEqualTest( ){
                    Quantity length1 = new Foot(1);
                    Quantity length2 = new CentiMeter(30.48);
                    assertTrue(length1.isEqual(length2));
                }

                @Test
                public void isNotEqualTest(){
                    Quantity length1 = new Foot(1);
                    Quantity length2 = new CentiMeter(5);
                    assertFalse(length1.isEqual(length2));
                }



                @Test
                public void shouldConvertFootToCentiMeter(){
                    Quantity length1 = new Foot(1);
                    Quantity length2 = new CentiMeter(30.48);
                    Assert.assertEquals(30.48, length1.convertTo(length2).getValue(), 2);
                }

                @Test
                public void shouldConvertFootToMeter() {
                    Quantity length1 = new Foot(1);
                    Quantity length2 = new Meter(2);
                    Assert.assertEquals(0.3048, length1.convertTo(length2).getValue(),2);
                }

                @Test
                public void shouldConvertMeterToInch(){
                    Quantity length1 = new Meter(1);
                    Quantity length2 = new Inch(2);
                    Assert.assertEquals(39.3701,length1.convertTo(length2).getValue(),2);

        }

                @Test
                public void shouldConvertFootToInch(){
                    Quantity length1 = new Foot(1);
                    Quantity length2 = new Inch(2);
                    Assert.assertEquals(12,length1.convertTo(length2).getValue(),2);
                }

                @Test
                public void shouldConvertCentiMeterToInch(){
                    Quantity length1 = new CentiMeter(2.54);
                    Quantity length2 = new Inch(2);
                    Assert.assertEquals(1,length1.convertTo(length2).getValue(),2);
                }


                @Test
                public void shouldAddInchToMeter(){
                    Quantity length1 = new Meter(2);
                    Quantity length2 = new Inch(2);
                    Assert.assertEquals(2.0508,length1.addQuantity(length2).getValue(),2);
                }

                @Test
                public void shouldAddCentiMeterToFoot(){
                    Quantity length1 = new Foot(2);
                    Quantity length2 = new CentiMeter(3);
                    Assert.assertEquals(2.098,length1.addQuantity(length2).getValue(),2);
                }


                }

