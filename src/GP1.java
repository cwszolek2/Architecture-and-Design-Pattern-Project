//Primary class of implementation
//Represents a gas pump of type 1.
//Part of Abstract Factory Pattern.
public class GP1{
    MDA_EFSM m;
    DS1 d;
    GP1Factory af;
    OutputProcessor op;

    // Constructor
    public GP1() {
    }
    //Creates Application of abstract factory, datastore, output processor, and mda_efsm.
    public void activate(int a){
        if (a > 0){
            af = new GP1Factory();
            d = af.makeDataStore();
            op = new OutputProcessor(af, d);
            m = new MDA_EFSM(op);
            d.temp_a = a;
            m.activate();
        }
    }
    public void payCash(int c){
        if (c > 0){
            d.temp_c = c;
            m.payCash();
        }
    }
    public void payCredit(){
        m.payCredit();
    }
    public void approved(){
        m.approved();
    }
    public void reject(){
        m.reject();
    }
    public void cancel(){
        m.cancel();
    }
    public void startPump(){
        m.startPump();
    }
    public void pumpLiter(){
        if(d.w == 1){
            m.pump();
        }
        else if ((d.cash > 0) && (d.cash < d.price*(d.L + 1))) {
            m.stopPump();
        }
        else{
            m.pump();
        }
    }
    public void stopPump(){
        m.stopPump();
    }
    public void start(){
        m.start();
    }
}