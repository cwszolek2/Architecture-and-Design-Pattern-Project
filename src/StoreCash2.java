//**STRATEGY PATTERN**
//ACTION
// A child of Storecash, this is a created as a part of the GasPump1 process.
//Does nothing as cash cannot be used.
public class StoreCash2 extends StoreCash {
    public StoreCash2(){

    }
    @Override
    public void storeCash(DataStore d){
        //Empty Method
    }
}
