/**
 * Created by Apoorva Mittal on 11-08-2015.
 */


abstract public class Temperature {



    public Temperature(){}

    abstract public Temperature convertToBase();
    //abstract public Temperature convertTo(Temperature temperature);
    abstract public double getValue();



    public boolean isEqual(Temperature temperature){
        return (this.convertToBase().getValue() == temperature.convertToBase().getValue());
    }



}
