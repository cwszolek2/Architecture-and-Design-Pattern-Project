//**STATE PATTERN**
//Idle state is a GP state that was created and awaiting commands from the user.
public class IdleState extends State {
    MDA_EFSM m;
    OutputProcessor op;

    public IdleState(MDA_EFSM mda, OutputProcessor p){
        m = mda;
        op = p;
    }
    public void activate(){

    }
    public void start(){
        op.payMsg();
        op.initializeData();
        op.setW(1);
        m.changeState(2);
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
