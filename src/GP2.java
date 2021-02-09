
public class GP2{
    //Instantce Variable
    MDA_EFSM m;
    DS2 d;
    GP2Factory af;
    OutputProcessor op;

    // Constructor
    public GP2() {

    }
    public void Activate(float a, float b, float c){
        if((a > 0) && (b > 0) && (c > 0)){
            d.temp_a = a;
            d.temp_b = b;
            d.temp_c = c;
            af = new GP2Factory();
            d = af.makeDataStore();
            op = new OutputProcessor(af, d);
            m = new MDA_EFSM(op);
            m.activate();
        }
    }
    public void Start(){
        m.start();
    }
    public void PayCredit(){
        m.payCredit();
    }
    public void Reject(){
        m.reject();
    }
    public void PayDebit(String p){
        d.temp_p = p;
        m.payDebit();
    }
    public void Pin(String pin){
        if(d.pin == pin)
            m.correctPin();
        else m.incorrectPin(1);
    }
    public void Cancel(){
        m.cancel();
    }
    public void Approved(){
        m.approved();
    }
    public void Regular(){
        m.selectGas(1);
    }
    public void Super(){
        m.selectGas(2);
    }
    public void Diesel(){
        m.selectGas(3);
    }
    public void StartPump(){
        if ( d.price > 0)
            m.startPump();
    }
    public void PumpGallon(){
        //Maybe should indicate on e
        m.pump();
    }
    public void StopPump(){
        m.stopPump();
    }
    public void FullTank(){
        m.stopPump();
    }


    /*
        Activate(float a, float b, float c)
        Start()
        PayCredit()
        Reject()
        PayDebit(string p)
        Pin(string x)
        Cancel()
        Approved()
        Diesel()
        Regular()
        Super()
        StartPump()
        PumpGallon()
        StopPump()
        FullTank()

     */


}