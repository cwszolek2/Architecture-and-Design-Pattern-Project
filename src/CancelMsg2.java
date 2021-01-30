//***STRATEGY PATTERN***
//ACTION
//A child of CancelMsg, this is a created as a part of the GasPump2 process.
//Will print out that a transaction is cancelled when cancelled.

public class CancelMsg2 extends CancelMsg {

    public CancelMsg2(){

    }
    @Override
    public void cancelMsg() {
        System.out.println("Transaction cancelled.");
    }
}
