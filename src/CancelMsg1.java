//***STRATEGY PATTERN***
//ACTION
//A child of CancelMsg, this is a created as a part of the GasPump1 process.
//Will print out that a transaction is cancelled when cancelled.

public class CancelMsg1 extends CancelMsg {
    public CancelMsg1(){

    }
    @Override
    public void cancelMsg(){
        System.out.println("Transaction cancelled.");

    }
}
