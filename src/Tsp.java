/**
 * Created by Apoorva Mittal on 11-08-2015.
 */
public class Tsp extends Volume {

    private final double CONVERSION_FACTOR_TO_BASE_UNIT = (1.0/3.0);


    public Tsp(double value){
        super(value);
    }

    @Override
    public Volume convertToBase() {
        Volume tbsp = new Tbsp(this.getValue()* CONVERSION_FACTOR_TO_BASE_UNIT);
        return tbsp;
    }

    @Override
    public double getConversionFactor() {
        return CONVERSION_FACTOR_TO_BASE_UNIT;
    }

    @Override
    public Volume makeDummy(double value) {
        return new Tsp(value);
    }
}
