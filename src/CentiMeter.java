/**
 * Created by Apoorva Mittal on 10-08-2015.
 */
public class CentiMeter extends Length {
    public CentiMeter(double value){
        super(value);
    }


    @Override
    public Length convertToCentiMeter() {
        return this;
    }

    public Length convertFromCentiMeter(Length length){
        return this;
    }
}
