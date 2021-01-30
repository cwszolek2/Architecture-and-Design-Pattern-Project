//**STRATEGY PATTERN**
//ACTION
// A child of StorePin, this is a created as a part of the GasPump1 process.
//Does nothing as pins aren't used for GP1
public class StorePin1 extends StorePin {
    public StorePin1(){

    }
    @Override
    public void storePin(DataStore ds){
        //Do nothing
    }
}
