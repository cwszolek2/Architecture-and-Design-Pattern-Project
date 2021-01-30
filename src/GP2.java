//Primary class of implementation
//Represents a gas pump of type 2.
//Part of Abstract Factory Pattern.
public class GP2{
    //Instance Variable
    MDA_EFSM m;
    DS2 d;
    GP2Factory af;
    OutputProcessor op;

    // Constructor
    public GP2() {

    }
    //Creates Application of abstract factory, datastore, output processor, and mda_efsm.
    public void activate(float a, float b, float c){
        if((a > 0) && (b > 0) && (c > 0)){

            af = new GP2Factory();
            d = af.makeDataStore();
            op = new OutputProcessor(af, d);
            m = new MDA_EFSM(op);
            d.temp_a = a;
            d.temp_b = b;
            d.temp_c = c;
            m.activate();
        }
    }
    public void start(){
        m.start();
    }
    public void payCredit(){
        m.payCredit();
    }
    public void reject(){
        m.reject();
    }
    public void payDebit(String p){
        d.temp_p = p;
        m.payDebit();
    }
    public void pin(String pin){
        if(d.pin == pin)
            m.correctPin();
        else m.incorrectPin(1);
    }
    public void cancel(){
        m.cancel();
    }
    public void approved(){
        m.approved();
    }
    public void regular(){
        m.selectGas(1);
    }
    public void superg(){
        m.selectGas(2);
    }
    public void diesel(){
        m.selectGas(3);
    }
    public void startPump(){
        if ( d.price > 0)
            m.startPump();
    }
    public void pumpGallon(){
        m.pump();
    }
    public void stopPump(){
        m.stopPump();
    }
    public void fullTank(){
        m.stopPump();
    }

}