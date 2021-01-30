//**STRATEGY PATTERN**
//ACTION
// A child of StorePrices, this is a created as a part of the GasPump1 process.
//Stores temp_a in price in the datastore
public class StorePrices1 extends StorePrices {
    public StorePrices1(){
    }
    @Override
    public void storePrices(DataStore ds){
        DS1 d = (DS1) ds;
        d.price = d.temp_a;
    }
}
