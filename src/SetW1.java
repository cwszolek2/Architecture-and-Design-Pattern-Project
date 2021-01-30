//**STRATEGY PATTERN**
//ACTION
// A child of SetW, this is a created as a part of the GasPump1 process.
//Sets w to 0 if cash is used.
public class SetW1 extends SetW {
    public SetW1(){

    }
    @Override
    public void setW(int w, DataStore ds){
        DS1 d = (DS1) ds;
        d.w = w;
    }
}
