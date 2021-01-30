//**STRATEGY PATTERN**
//ACTION
//A child of PrintReceipt, this is a created as a part of the GasPump2 process.
//Pumps 1 Gallon of gas, and increases the total by one price amount.
public class PumpGasUnit2 extends PumpGasUnit {
    public PumpGasUnit2(){

    }
    @Override
    public void pumpGasUnit(DataStore ds){
        DS2 d = (DS2) ds;
        d.G++;
        d.total += d.price;
    }
}
