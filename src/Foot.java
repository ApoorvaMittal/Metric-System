/**
 * Created by Apoorva Mittal on 10-08-2015.
 */
public class Foot extends Length{
    private final double conversionFactorFromFootToCentiMeter = 30.48;
    private final double conversionFactorFromCentiMeterToFoot = 0.0328084;

    public Foot(double value){
        super(value);

    }


    @Override
    public Length convertToCentiMeter() {

        Length centimeter = new CentiMeter(this.getValue()*conversionFactorFromFootToCentiMeter);
        return centimeter;
    }

    public Length convertFromCentiMeter(Length length){
        double footValue = (length.getValue())*conversionFactorFromCentiMeterToFoot;
        Length foot = new Foot(footValue);
        return foot;
    }
    public Length addLength(Length length2){

        Length length = new Foot(length2.convertTo(this).getValue()+this.getValue());

        return this;
    }



}
