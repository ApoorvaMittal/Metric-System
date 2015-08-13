/**
 * Created by Apoorva Mittal on 11-08-2015.
 */
public class Celsius extends Temperature {
    private double value;

    public Celsius(double value){
        this.value = value;
    }

    @Override
    public double getValue(){
        return value;
    }

    @Override
    public Temperature convertToBase() {
        return this;
    }


    public static Temperature makeDummy(double value) { return new Celsius(value); }



    public Temperature convertToFahrenheit() {
        return Fahrenheit.makeDummy(value*9.0/5.0 + 32);
    }
}
