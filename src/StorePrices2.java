//**STRATEGY PATTERN**
//ACTION
// A child of StorePrices, this is a created as a part of the GasPump2 process.
//Stores temp_a in price in the datastore
public class StorePrices2 extends StorePrices {
    public StorePrices2(){

    }
    @Override
    public void storePrices(DataStore ds){
        DS2 d = (DS2) ds;
        d.rprice = d.temp_a;
        d.sprice = d.temp_b;
        d.dprice = d.temp_c;
    }
}
