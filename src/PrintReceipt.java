//**STRATEGY PATTERN**
//ACTION
// This is an inherited function by children, created by part of the abstract factory pattern.
//Prints receipt - showing amount of gas and total.
public class PrintReceipt {
    public void printReceipt(){
        System.out.println("Shouldn't see this");
    }
    public void printReceipt(DataStore ds){System.out.println("Shouldn't see this");}
}

