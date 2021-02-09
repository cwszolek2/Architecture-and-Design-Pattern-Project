
public class PumpGasUnit1 extends PumpGasUnit {

    public PumpGasUnit1(){

    }
    //TODO see why this is unused
    public void pumpGasUnit(DS1 d){
        d.L++;
        d.total += d.price;
    }
}
