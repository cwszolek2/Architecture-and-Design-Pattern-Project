//**STRATEGY PATTERN**
//ACTION
// A child of StorePin, this is a created as a part of the GasPump2 process.
//Stores pin of debit card.
public class StorePin2 extends StorePin {
    public StorePin2(){

    }
    @Override
    public void storePin(DataStore ds){
        DS2 d = (DS2) ds;
        d.pin = d.temp_p;
    }

}
