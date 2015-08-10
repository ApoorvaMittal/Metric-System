/**
 * Created by Apoorva Mittal on 10-08-2015.
 */
public class Inch extends Length {
    private final double conversionFactorForCentiMeter = 2.54;
    private final double conversionFactorFromCentiMeterToInch = 0.393701;
    public Inch(double value){
        super(value);
    }


    @Override
    public Length convertToCentiMeter() {
        Length centimeter = new CentiMeter(this.getValue()*conversionFactorForCentiMeter);
        return centimeter;
    }

    public Length convertFromCentiMeter(Length length){

        double inchValue = (length.getValue())*conversionFactorFromCentiMeterToInch;
        Length inch = new Inch(inchValue);
        return inch;
    }

    public Length addLength(Length length2){

        Length length = new Inch(length2.convertTo(this).getValue()+this.getValue());

        return this;
    }

}
