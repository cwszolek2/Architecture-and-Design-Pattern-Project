//**STRATEGY PATTERN**
//ACTION
//A child of PrintReceipt, this is a created as a part of the GasPump2 process.
//Prints receipt - showing amount of gas and total.
public class PrintReceipt2 extends PrintReceipt {

    public PrintReceipt2(){

    }
    @Override
    public void printReceipt(DataStore ds){
        DS2 d = (DS2) ds;
        System.out.println("Gallons Pumped: " + d.G + "\nYour total is: " + d.total);
    }
}
