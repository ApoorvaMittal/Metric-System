/**
 * Created by Apoorva Mittal on 10-08-2015.
 */
abstract public class Length {
    private double value;
    public Length(double value){
        this.value = value;
    }
    public Length(){
    }
    public boolean isEqual(Length length){

        return (this.convertToCentiMeter().getValue() == length.convertToCentiMeter().getValue());
    }
    abstract public Length convertToCentiMeter();
     public Length convertTo(Length length){
         return length.convertFromCentiMeter(this.convertToCentiMeter());
     }

    abstract public Length convertFromCentiMeter(Length length);

    public double getValue(){
        return value;
    }
}
