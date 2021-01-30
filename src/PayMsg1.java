//**STRATEGY PATTERN**
//ACTION
//A child of PayMsg, this is a created as a part of the GasPump1 process.
//Prints to user possible payment options.
public class PayMsg1 extends PayMsg {

    public PayMsg1(){

    }
    @Override
    public void payMsg(){
        System.out.println("Pay with Cash or Credit?");
    }
}
