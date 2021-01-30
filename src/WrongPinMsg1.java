//**STRATEGY PATTERN**
//ACTION
// A child of WrongPinMsg, this is a created as a part of the GasPump1 process.
//Does nothing, as GP1 does not use pin.
public class WrongPinMsg1 extends WrongPinMsg {

    public WrongPinMsg1(){

    }
    @Override
    public void wrongPinMsg(){
        //Do nothing
    }
}
