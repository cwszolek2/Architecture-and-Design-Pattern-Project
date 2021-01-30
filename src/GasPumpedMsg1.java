//**STRATEGY PATTERN**
//ACTION
//A child of GasPumpedMsg, this is a created as a part of the GasPump1 process.
//Prints to user that one liter was pumped.
public class GasPumpedMsg1 extends GasPumpedMsg {
    public GasPumpedMsg1(){

    }
    @Override
    public void gasPumpedMsg(){
        System.out.println("1 Liter Pumped.");
    }
}
