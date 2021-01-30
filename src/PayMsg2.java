//**STRATEGY PATTERN**
//ACTION
//A child of PayMsg, this is a created as a part of the GasPump1 process.
//Prints to user possible payment options.
public class PayMsg2 extends PayMsg {

    public PayMsg2(){

    }
    @Override
    public void payMsg(){
        System.out.println("Pay with Debit or Credit?");
    }
}
