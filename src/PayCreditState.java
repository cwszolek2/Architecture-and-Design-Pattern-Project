//**STATE PATTERN**
//State where pay credit was selected by user.  Waiting to see if card will be approved or rejected.
public class PayCreditState extends State {
    MDA_EFSM m;
    OutputProcessor op;

    public PayCreditState(MDA_EFSM mda, OutputProcessor p){
        m = mda;
        op = p;
        //Do action to determine if card is acceptable or not.
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
        op.rejectMsg();
        op.ejectCard();
        m.changeState(1);
    }
    public void approved(){
        op.displayMenu();
        op.ejectCard();
        m.changeState(5);
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

    }
    public void incorrectPin(int max){

    }

}
