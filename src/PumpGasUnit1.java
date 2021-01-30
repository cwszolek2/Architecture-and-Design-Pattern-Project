//**STRATEGY PATTERN**
//ACTION
//A child of PrintReceipt, this is a created as a part of the GasPump1 process.
//Pumps 1 Liter of gas, and increases the total by one price amount.
public class PumpGasUnit1 extends PumpGasUnit {

    public PumpGasUnit1(){

    }
    @Override
    public void pumpGasUnit(DataStore ds){
        DS1 d = (DS1) ds;
        //if(d.w == 1){
        //   if(d.cash < d.total + d.price){
        //       System.out.println("Cash depleted");
         //      return;
        //   }
        //}
        System.out.println("Here");
        d.L++;
        d.total += d.price;
    }
}
