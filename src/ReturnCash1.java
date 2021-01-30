//**STRATEGY PATTERN**
//ACTION
//A child of ReturnCash, this is a created as a part of the GasPump1 process.
//Returns inserted cash to users
public class ReturnCash1 extends ReturnCash {
    public ReturnCash1(){

    }
    @Override
    public void returnCash(DataStore ds){
        DS1 d = (DS1) ds;
        d.cash = 0;
    }
}
