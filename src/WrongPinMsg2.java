//**STRATEGY PATTERN**
//ACTION
// A child of WrongPinMsg, this is a created as a part of the GasPump2 process.
//Does nothing, as GP2 does not use pin.
public class WrongPinMsg2 extends WrongPinMsg {
    public WrongPinMsg2(){

    }
    @Override
    public void wrongPinMsg(){
        System.out.println("Wrong pin entered.");
    }
}