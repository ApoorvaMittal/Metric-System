/**
 * Created by Apoorva Mittal on 11-08-2015.
 */
public abstract class Volume {

    private double value;
    public Volume(double value){
        this.value = value;
    }


    public boolean isEqual(Volume volume){

        return (this.convertToBase().getValue() == volume.convertToBase().getValue());
    }

    public Volume convertTo(Volume volume){
        return volume.makeDummy((this.convertToBase().getValue())/volume.getConversionFactor());
        // return quantity.convertFromBase(this.convertToBase());
    }

    public double getValue(){
        return value;
    }



    public Volume addVolume(Volume volume){

        return this.makeDummy(this.convertToBase().getValue() + volume.convertToBase().getValue());

    }


    abstract public Volume convertToBase();
    //  abstract public Quantity convertFromBase(Quantity quantity);
    abstract public double getConversionFactor();
    abstract public Volume makeDummy(double value);




}
