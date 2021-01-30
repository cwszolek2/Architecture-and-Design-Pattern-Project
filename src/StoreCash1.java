//**STRATEGY PATTERN**
//ACTION
// A child of Storecash, this is a created as a part of the GasPump1 process.
//Stores cash in the datastore that user entered.
public class StoreCash1 extends StoreCash {
    public StoreCash1(){

    }
    @Override
    public void storeCash(DataStore ds){
        DS1 d = (DS1) ds;
        d.cash = d.temp_c;
    }
}
