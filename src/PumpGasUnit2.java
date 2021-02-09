
public class PumpGasUnit2 extends PumpGasUnit {
    public PumpGasUnit2(){

    }
    public void pumpGasUnit(DS2 d){
        d.G++;
        d.total += d.price;
    }
}
