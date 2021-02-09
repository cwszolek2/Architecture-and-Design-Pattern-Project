
public class StartState extends State {
    MDA_EFSM m;
    OutputProcessor op;

    public StartState(MDA_EFSM mda, OutputProcessor p){
        m = mda;
        op = p;
    }
    public void activate(){

    }
    public void start(){

    }
    public void payCash(){
        //I guess nothing needed for store cash?  weird.
        op.storeCash();
        op.displayMenu();
        op.setW(1);
        m.changeState(5);
    }
    public void payCredit(){
        m.changeState(3);
    }
    public void payDebit(){
        op.enterPinMsg();
        op.storePin();
        m.k = 0;
        m.changeState(4);
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


}
