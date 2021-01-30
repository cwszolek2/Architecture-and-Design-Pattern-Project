//**STRATEGY PATTERN**
//ACTION
// A child of SetW, this is a created as a part of the GasPump1 process.
//Does nothing because cash isn't used.
public class SetW2 extends SetW {
    public SetW2(){

    }
    @Override
    public void setW(int w, DataStore ds){
        //does nothing
    }
}
