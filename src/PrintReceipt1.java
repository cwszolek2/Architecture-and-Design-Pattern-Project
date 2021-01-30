//**STRATEGY PATTERN**
//ACTION
//A child of PrintReceipt, this is a created as a part of the GasPump1 process.
//Prints receipt - showing amount of gas and total.
public class PrintReceipt1 extends PrintReceipt {

    public PrintReceipt1(){

    }
    @Override
    public void printReceipt(DataStore ds){
        DS1 d = (DS1) ds;
        System.out.println("Liters Pumped: " + d.L + "\nYour total is: " + d.total);
    }
}
