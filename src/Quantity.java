    /**
     * Created by Apoorva Mittal on 10-08-2015.
     */
    abstract public class Quantity {
        private double value;
        public Quantity(double value){
            this.value = value;
        }


        public boolean isEqual(Quantity quantity){

            return (this.convertToBase().getValue() == quantity.convertToBase().getValue());
        }

        public Quantity convertTo(Quantity quantity){
           return quantity.makeDummy(this.convertToBase().getValue()/this.getConversionFactor());
             // return quantity.convertFromBase(this.convertToBase());
         }

        public double getValue(){
            return value;
        }



        public Quantity addQuantity(Quantity quantity){

           return this.makeDummy(this.convertToBase().getValue() + quantity.convertToBase().getValue());

        }


        abstract public Quantity convertToBase();
      //  abstract public Quantity convertFromBase(Quantity quantity);
        abstract public double getConversionFactor();
        abstract public Quantity makeDummy(double value);


    }
