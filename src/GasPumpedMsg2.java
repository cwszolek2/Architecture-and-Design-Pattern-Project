//**STRATEGY PATTERN**
//ACTION
//A child of GasPumpedMsg, this is a created as a part of the GasPump2 process.
//Prints to user that one liter was pumped.
public class GasPumpedMsg2 extends GasPumpedMsg {
    public GasPumpedMsg2(){

    }
    @Override
    public void gasPumpedMsg(){
        System.out.println("1 Gallon Pumped.");
    }
}
