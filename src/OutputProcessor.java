
public class OutputProcessor{
    AbstractFactory af;
    DataStore d;
    StorePrices storepri;
    PayMsg pm;
    StoreCash sc;
    DisplayMenu dp;
    RejectMsg rm;
    SetPrice setpri;
    SetInitialValues siv;
    PumpGasUnit pgu;
    GasPumpedMsg gpm;
    PrintReceipt pr;
    CancelMsg cm;
    ReturnCash rc;
    WrongPinMsg wpm;
    StorePin spin;
    EnterPinMsg epm;
    InitializeData id;
    EjectCard ec;
    //State s;

    public OutputProcessor(AbstractFactory afToSet, DataStore ds){
        af = afToSet;
        d = ds;
        storepri = af.makeStorePrices();
        pm = af.makePayMsg();
        sc = af.makeStoreCash();
        dp = af.makeDisplayMenu();
        rm = af.makeRejectMsg();
        setpri = af.makeSetPrice();
        siv = af.makeSetInitialValues();
        pgu = af.makePumpGasUnit();
        gpm = af.makeGasPumpedMsg();
        pr = af.makePrintReceipt();
        cm = af.makeCancelMsg();
        rc = af.makeReturnCash();
        wpm = af.makeWrongPinMsg();
        spin = af.makeStorePin();
        epm = af.makeEnterPinMsg();
        id = af.makeInitializeData();
        ec = af.makeEjectCard();
    }
    public void setW(int w){

    }
    public void storePrices(){
        storepri.storePrices();
    }
    public void payMsg(){
        pm.payMsg();
    }
    public void storeCash(){
        sc.storeCash();
    }
    public void displayMenu(){
        dp.displayMenu();
    }
    public void rejectMsg(){
        rm.rejectMsg();
    }
    public void setPrice(int p){
        setpri.setPrice(p);
    }
    public void setInitialValues(){
        siv.setInitialValues();
    }
    public void pumpGasUnit(){
        pgu.pumpGasUnit(d);
    }
    public void gasPumpedMsg(){
        gpm.gasPumpedMsg();
    }
    public void printReceipt(){
        pr.printReceipt();
    }
    public void cancelMsg(){
        cm.cancelMsg();
    }
    public void returnCash(){
        rc.returnCash();
    }
    public void wrongPinMsg(){
        wpm.wrongPinMsg();
    }
    public void storePin(){
        spin.storePin();
    }
    public void enterPinMsg(){
        epm.enterPinMsg();
    }
    public void initializeData(){
        id.initializeData();
    }
    public void ejectCard(){
        ec.ejectCard();
    }

}