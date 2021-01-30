//**STRATEGY PATTERN**
//ACTION
//A child of SetInitialValues, this is a created as a part of the GasPump2 process.
//Sets G and total to 0.
public class SetInitialValues2 extends SetInitialValues {
    public SetInitialValues2(){

    }
    @Override
    public void setInitialValues(DataStore ds){
        DS2 d = (DS2) ds;
        d.G = 0;
        d.total = 0;
    }
}
