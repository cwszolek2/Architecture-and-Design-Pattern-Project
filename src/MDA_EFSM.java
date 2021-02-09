public class MDA_EFSM{
    State s;
    State[] state_array;
    int k;

    public MDA_EFSM(OutputProcessor p){
        //Add whatever needs to be here.
        state_array = new State[6];
        state_array[0] = new OffState(this, p);
        state_array[1] = new IdleState(this, p);
        state_array[2] = new StartState(this, p);
        state_array[3] = new PayCreditState(this, p);
        state_array[4] = new PayDebitState(this, p);
        state_array[5] = new SelectGasState(this, p);
        state_array[6] = new PumpGasState(this, p);
        s = state_array[0];
        k = 0;

    }
    //TODO - Make sure these are used properly.
    public void changeState(int ID){
        s = state_array[ID];
    }
    public void activate(){
        s.activate();
    }
    public void start(){
        s.start();
    }
    public void reject(){
        s.reject();
    }
    public void cancel(){
        s.cancel();
    }
    public void approved(){
        s.approved();
    }
    public void startPump(){
        s.startPump();
    }
    public void pump(){
        s.pump();
    }
    public void stopPump(){
        s.stopPump();
    }
    public void selectGas(int g){
        s.selectGas(g);
    }
    public void correctPin(){
        s.correctPin();
    }
    public void incorrectPin(int p){
        s.incorrectPin(p);
    }
    public void payCash(){
        s.payCash();
    }
    public void payCredit(){
        s.payCredit();
    }
    public void payDebit(){
        s.payDebit();
    }
}