//**ABSTRACT FACTORY**
//Child of AbstractFactory - this is for GP1's usage to create
//actions for GP1.
public class GP2Factory extends AbstractFactory {
    public DS2 makeDataStore(){
        return new DS2();
    }
    public StorePrices makeStorePrices(){
        return new StorePrices2();
    }
    public PayMsg makePayMsg(){
        return new PayMsg2();
    }
    public StoreCash makeStoreCash(){
        return new StoreCash2();
    }
    public DisplayMenu makeDisplayMenu(){
        return new DisplayMenu2();
    }
    public RejectMsg makeRejectMsg(){
        return new RejectMsg2();
    }
    public SetPrice makeSetPrice(){
        return new SetPrice2();
    }
    public SetInitialValues makeSetInitialValues(){
        return new SetInitialValues2();
    }
    public PumpGasUnit makePumpGasUnit(){
        return new PumpGasUnit2();
    }
    public GasPumpedMsg makeGasPumpedMsg(){
        return new GasPumpedMsg2();
    }
    public PrintReceipt makePrintReceipt(){
        return new PrintReceipt2();
    }
    public CancelMsg makeCancelMsg(){
        return new CancelMsg2();
    }
    public ReturnCash makeReturnCash(){
        return new ReturnCash2();
    }
    public WrongPinMsg makeWrongPinMsg(){
        return new WrongPinMsg2();
    }
    public StorePin makeStorePin(){
        return new StorePin2();
    }
    public EnterPinMsg makeEnterPinMsg(){
        return new EnterPinMsg2();
    }
    public InitializeData makeInitializeData(){
        return new InitializeData2();
    }
    public EjectCard makeEjectCard(){
        return new EjectCard2();
    }
    public SetW makeSetW(){ return new SetW2();
    }
}