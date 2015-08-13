/**
 * Created by Apoorva Mittal on 10-08-2015.
 */
public class Foot extends Quantity {
    private final double CONVERSION_FACTOR_TO_BASE_UNIT = 30.48;


    public Foot(double value){
        super(value);

    }


    @Override
    public Quantity convertToBase() {

        Quantity centimeter = new CentiMeter(this.getValue()* CONVERSION_FACTOR_TO_BASE_UNIT);
        return centimeter;
    }



    @Override
    public Quantity makeDummy(double value) {
        return new Foot(value);
    }

    @Override
    public double getConversionFactor() {
        return CONVERSION_FACTOR_TO_BASE_UNIT;
    }



}
