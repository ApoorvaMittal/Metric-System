/**
 * Created by Apoorva Mittal on 10-08-2015.
 */
public class Inch extends Quantity {
    private final double CONVERSION_FACTOR_TO_BASE_UNIT = 2.54;

    public Inch(double value){
        super(value);
    }


    @Override
    public Quantity convertToBase() {
        Quantity centimeter = new CentiMeter(this.getValue()* CONVERSION_FACTOR_TO_BASE_UNIT);
        return centimeter;
    }




    @Override
    public Quantity addQuantity(Quantity quantity){

        return new Inch(quantity.convertTo(this).getValue()+this.getValue());

       // return length;
    }

    @Override
    public Quantity makeDummy(double value) {
        return new Inch(value);
    }

    @Override
    public double getConversionFactor() {
        return CONVERSION_FACTOR_TO_BASE_UNIT;
    }



}
