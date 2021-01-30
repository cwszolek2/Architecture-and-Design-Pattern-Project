//**STATE PATTERN**
//State before Gas Pump has been activated for GP.  Can only be activated.
public class OffState extends State {
    MDA_EFSM m;
    OutputProcessor op;

    public OffState(MDA_EFSM mda, OutputProcessor p){
        m = mda;
        op = p;
    }
    public void activate(){
        op.storePrices();
        m.changeState(1);
    }
    public void start(){

    }
    public void reject(){

    }
    public void cancel(){

    }
    public void approved(){

    }
    public void startPump(){

    }
    public void pump(){

    }
    public void stopPump(){

    }
    public void selectGas(int g){

    }
    public void correctPin(){

    }
    public void incorrectPin(int max){

    }
    public void payCash(){

    }
    public void payCredit(){

    }
    public void payDebit(){

    }


}