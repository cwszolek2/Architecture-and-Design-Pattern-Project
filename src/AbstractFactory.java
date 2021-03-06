
public abstract class AbstractFactory{
    public abstract DataStore makeDataStore();
    public abstract PayMsg makePayMsg();
    public abstract StorePrices makeStorePrices();
    public abstract StoreCash makeStoreCash();
    public abstract DisplayMenu makeDisplayMenu();
    public abstract RejectMsg makeRejectMsg();
    public abstract SetPrice makeSetPrice();
    public abstract SetInitialValues makeSetInitialValues();
    public abstract PumpGasUnit makePumpGasUnit();
    public abstract GasPumpedMsg makeGasPumpedMsg();
    public abstract PrintReceipt makePrintReceipt();
    public abstract CancelMsg makeCancelMsg();
    public abstract ReturnCash makeReturnCash();
    public abstract WrongPinMsg makeWrongPinMsg();
    public abstract StorePin makeStorePin();
    public abstract EnterPinMsg makeEnterPinMsg();
    public abstract InitializeData makeInitializeData();
    public abstract EjectCard makeEjectCard();
    public abstract void setW(int i);
}