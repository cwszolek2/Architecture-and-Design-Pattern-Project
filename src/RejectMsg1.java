//**STRATEGY PATTERN**
//ACTION
//A child of RejectMsg, this is a created as a part of the GasPump1 process.
//Prints to user that their credit card has been rejected.
public class RejectMsg1 extends RejectMsg {
    public RejectMsg1(){

    }
    @Override
    public void rejectMsg(){
        System.out.println("Card Rejected");
    }
}
