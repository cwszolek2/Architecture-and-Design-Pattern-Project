//**STRATEGY PATTERN**
//ACTION
//A child of EnterPinMsg, this is a created as a part of the GasPump1 process.
//Does nothing, as gp1 has no pin usage.
public class EnterPinMsg1 extends EnterPinMsg {
    public EnterPinMsg1(){

    }
    @Override
    public void enterPinMsg(){
        //Empty method.
    }

}
