/**
 * Created by Apoorva Mittal on 11-08-2015.
 */
public class Tbsp extends Volume {

    private final double CONVERSION_FACTOR_TO_BASE_UNIT = 1;

    public Tbsp(double value){
        super(value);
    }

    @Override
    public Volume convertToBase() {
        return this;
    }



    @Override
    public double getConversionFactor() {
        return CONVERSION_FACTOR_TO_BASE_UNIT;
    }


    @Override
    public Volume makeDummy(double value) {
        return new Tbsp(value);
    }
}
