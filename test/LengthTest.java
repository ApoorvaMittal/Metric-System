            /**
             * Created by Apoorva Mittal on 10-08-2015.
             */

            import static org.junit.Assert.assertEquals;
            import static org.junit.Assert.assertTrue;

            import org.junit.Assert;
            import org.junit.Test;
            public class LengthTest


            {
                @Test
                public void isEqualTest( ){
                    Length length1 = new Foot(1);
                    Length length2 = new CentiMeter(30.48);
                    assertTrue(length1.isEqual(length2));
                }

                @Test
                public void shouldConvertFootToCentiMeter(){
                    Length length1 = new Foot(1);
                    Length length2 = new CentiMeter(30.48);
                    Assert.assertEquals(30.48, length1.convertTo(length2).getValue(),2);
                }

                @Test
                public void shouldConvertFootToMeter() {
                    Length length1 = new Foot(1);
                    Length length2 = new Meter(2);
                    Assert.assertEquals(0.3048, length1.convertTo(length2).getValue(),2);
                }
                @Test
                public void shouldConvertMeterToInch(){
                    Length length1 = new Meter(1);
                    Length length2 = new Inch(2);
                    Assert.assertEquals(39.3701,length1.convertTo(length2).getValue(),2);

        }

                }

