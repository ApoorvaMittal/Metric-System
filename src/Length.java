/**
 * Created by Apoorva Mittal on 10-08-2015.
 */
abstract public class Length {
    private double value;
    public Length(double value){
        this.value = value;
    }


    public boolean isEqual(Length length){

        return (this.convertToCentiMeter().getValue() == length.convertToCentiMeter().getValue());
    }

    public Length convertTo(Length length){
         return length.convertFromCentiMeter(this.convertToCentiMeter());
     }

    public double getValue(){
        return value;
    }

    abstract public Length addLength(Length length);

    abstract public Length convertToCentiMeter();

    abstract public Length convertFromCentiMeter(Length length);

}
