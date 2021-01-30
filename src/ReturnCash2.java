//**STRATEGY PATTERN**
//ACTION
//A child of ReturnCash, this is a created as a part of the GasPump1 process.
//Returns inserted cash to users
public class ReturnCash2 extends ReturnCash {
    public ReturnCash2(){

    }
    @Override
    public void returnCash(DataStore ds){
        //Does nothing
    }
}
