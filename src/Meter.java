/**
 * Created by Apoorva Mittal on 10-08-2015.
 */
public class Meter extends Quantity {
    private final double CONVERSION_FACTOR_TO_BASE_UNIT = 100 ;

    public Meter(double value){
        super(value);
    }

    @Override
    public double getConversionFactor() {
        return CONVERSION_FACTOR_TO_BASE_UNIT;
    }

    public Quantity convertToBase(){
        Quantity centimeter = new CentiMeter(this.getValue()* CONVERSION_FACTOR_TO_BASE_UNIT);
        return centimeter;
    }



    @Override
    public Meter addQuantity(Quantity quantity){

       return  new Meter(quantity.convertTo(this).getValue()+this.getValue());
     //   return length;
    }

    @Override
    public Quantity makeDummy(double value) {
        return new Meter(value);
    }
}
