/**
 * Created by Apoorva Mittal on 11-08-2015.
 */
public class Fahrenheit extends Temperature {

    private double value;

    public Fahrenheit(double value){
        this.value = value;
    }

    @Override
    public Temperature convertToBase() {
        return new Celsius((value - 32)*(5.0/9.0));
    }


    public Temperature convertToCelsius() {
        return Celsius.makeDummy(this.convertToBase().getValue());
    }

    @Override
    public double getValue(){
        return value;
    }


     public static Temperature makeDummy(double value) {
        return new Fahrenheit(value);
    }
}
