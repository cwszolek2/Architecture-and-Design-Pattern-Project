//**STRATEGY PATTERN**
//ACTION
//A child of EnterPinMsg, this is a created as a part of the GasPump1 process.
//Does nothing, as gp1 has no pin usage.
public class EnterPinMsg2 extends EnterPinMsg {
    public EnterPinMsg2(){

    }
    @Override
    public void enterPinMsg(){
        System.out.println("Please Enter Pin:\n");
    }

}
