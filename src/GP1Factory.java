
public class GP1Factory extends AbstractFactory {
    public DS1 makeDataStore(){
        return new DS1();
    }
    public StorePrices makeStorePrices(){
        return new StorePrices1();
    }
    public PayMsg makePayMsg() {
        return new PayMsg1();
    }
    public StoreCash makeStoreCash() {
        return new StoreCash1();
    }
    public DisplayMenu makeDisplayMenu() {
        return new DisplayMenu1();
    }
    public RejectMsg makeRejectMsg() {
        return new RejectMsg1();
    }
    public SetPrice makeSetPrice() { return new SetPrice1();
    }
    public SetInitialValues makeSetInitialValues() {
        return new SetInitialValues1();
    }
    public PumpGasUnit makePumpGasUnit() {
        return new PumpGasUnit1();
    }
    public GasPumpedMsg makeGasPumpedMsg() {
        return new GasPumpedMsg1();
    }
    public PrintReceipt makePrintReceipt() {
        return new PrintReceipt1();
    }
    public CancelMsg makeCancelMsg() {
        return new CancelMsg1();
    }
    public ReturnCash makeReturnCash() {
        return new ReturnCash1();
    }
    public WrongPinMsg makeWrongPinMsg() {
        return new WrongPinMsg1();
    }
    public StorePin makeStorePin() {
        return new StorePin1();
    }
    public EnterPinMsg makeEnterPinMsg() {
        return new EnterPinMsg1();
    }
    public InitializeData makeInitializeData() {
        return new InitializeData1();
    }
    public EjectCard makeEjectCard() {
        return new EjectCard1();
    }
    public void setW(int i){
        //TODO Figure out if anything is required by setW
    }
}