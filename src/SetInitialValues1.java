//**STRATEGY PATTERN**
//ACTION
//A child of SetInitialValues, this is a created as a part of the GasPump1 process.
//Sets L and total to 0.
public class SetInitialValues1 extends SetInitialValues {
    public SetInitialValues1(){

    }
    @Override
    public void setInitialValues(DataStore ds ){
        DS1 d = (DS1) ds;
        d.L = 0;
        d.total = 0;
    }
}
