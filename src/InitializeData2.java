//**STRATEGY PATTERN**
//ACTION
//A child of InitializeData, this is a created as a part of the GasPump2 process.
//Sets price to 0.
public class InitializeData2 extends InitializeData {

    public InitializeData2(){

    }
    @Override
    public void initializeData(DataStore ds){
        DS2 d = (DS2) ds;
        d.price = 0;
    }
}
