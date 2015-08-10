/**
 * Created by Apoorva Mittal on 10-08-2015.
 */
public class Meter extends Length{
    private final double conversionFactorForCentiMeter = 100 ;
    private final double conversionFactorFromCentiMeterMeter = 0.01;
    public Meter(double value){
        super(value);

    }

    public Length convertToCentiMeter(){
        Length centimeter = new CentiMeter(this.getValue()*conversionFactorForCentiMeter);
        return centimeter;
    }

    @Override
    public Length convertFromCentiMeter(Length length) {
        double meterValue = (length.getValue())*conversionFactorFromCentiMeterMeter;
        Length Meter = new Inch(meterValue);
        return Meter;
    }
}
