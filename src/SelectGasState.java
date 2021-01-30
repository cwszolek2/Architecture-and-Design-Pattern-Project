//**STATE PATTERN**
//State where the users selects which gas to pump.
public class SelectGasState extends State {
    MDA_EFSM m;
    OutputProcessor op;

    public SelectGasState(MDA_EFSM mda, OutputProcessor p){
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
        op.cancelMsg();
        op.returnCash();
        m.changeState(1);
    }
    public void startPump(){
        op.setInitialValues();
        m.changeState(6);
    }
    public void pump(){

    }
    public void stopPump(){

    }
    public void selectGas(int g){
        op.setPrice(g);
    }
    public void correctPin(){

    }
    public void incorrectPin(int max){

    }

}
