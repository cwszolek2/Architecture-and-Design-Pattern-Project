public class PayCreditState extends State {
    MDA_EFSM m;
    OutputProcessor op;

    public PayCreditState(MDA_EFSM mda, OutputProcessor p){
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
