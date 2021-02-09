
public class GP1{
    MDA_EFSM m;
    DS1 d;
    GP1Factory af;
    OutputProcessor op;

    // Constructor
    public GP1() {
    }

    public void Activate(int a){
        if (a > 0){
            af = new GP1Factory();
            d = af.makeDataStore();
            op = new OutputProcessor(af, d);
            m = new MDA_EFSM(op);
            d.temp_a = a;
            m.activate();
        }
    }
    public void PayCash(int c){
        if (c > 0){
            d.temp_c = c;
            m.payCash();
        }
    }
    public void PayCredit(){
        m.payCredit();
    }
    public void Approved(){
        m.approved();
    }
    public void Reject(){
        m.reject();
    }
    public void Cancel(){
        m.cancel();
    }
    public void StartPump(){
        m.startPump();
    }
    public void PumpLiter(){
        if(d.w == 1){
            m.pump();
        }
        else if ((d.cash > 0) && (d.cash < d.price*(d.L + 1))) {
            m.stopPump();
        }
    }
    public void StopPump(){
        m.stopPump();
    }
    public void Start(){
        m.start();
    }
}