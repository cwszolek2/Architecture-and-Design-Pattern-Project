//**STRATEGY PATTERN**
//ACTION
//A child of RejectMsg, this is a created as a part of the GasPump2 process.
//Prints to user that their credit card has been rejected.
public class RejectMsg2 extends RejectMsg {
    public RejectMsg2(){

    }
    @Override
    public void rejectMsg(){
        System.out.println("Card Rejected");
    }
}
