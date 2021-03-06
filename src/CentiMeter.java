/**
 * Created by Apoorva Mittal on 10-08-2015.
 */
public class CentiMeter extends Quantity {
    private final double CONVERSION_FACTOR_TO_BASE_UNIT = 1;

    public CentiMeter(double value){
        super(value);
    }


    @Override
    public Quantity convertToBase() {
        return this;
    }



    @Override
    public double getConversionFactor() {
        return CONVERSION_FACTOR_TO_BASE_UNIT;
    }



    @Override
    public Quantity makeDummy(double value) {
        return new CentiMeter(value);
    }
}
