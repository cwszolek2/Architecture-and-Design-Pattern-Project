
public class PayDebitState extends State {
    MDA_EFSM m;
    OutputProcessor op;

    public PayDebitState(MDA_EFSM mda, OutputProcessor p){
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

    }
    public void stopPump(){

    }
    public void selectGas(int g){

    }
    public void correctPin(){
        op.displayMenu();
        op.ejectCard();
        m.changeState(5);
    }
    public void incorrectPin(int max){
        if (m.k <= max){
            op.wrongPinMsg();
            m.k = m.k + 1;
        }
        else {
            op.wrongPinMsg();
            op.ejectCard();
            m.changeState(1);
        }
    }


}
