//**STATE PATTERN**
//State when gas has been selected and user is pumping gas.
public class PumpGasState extends State {
    MDA_EFSM m;
    OutputProcessor op;

    public PumpGasState(MDA_EFSM mda, OutputProcessor p){
        m = mda;
        op = p;
    }
    public void activate(){

    }
    public void start(){

    }
    public void payCash(){

    }
    public void payCredit(){

    }
    public void payDebit(){

    }
    public void reject(){

    }
    public void approved(){

    }
    public void cancel(){

    }
    public void startPump(){

    }
    public void pump(){
        op.pumpGasUnit();
        op.gasPumpedMsg();
    }
    public void stopPump(){
        op.printReceipt();
        m.changeState(1);
    }
    public void selectGas(int g){

    }
    public void correctPin(){

    }
    public void incorrectPin(int max){

    }

}
