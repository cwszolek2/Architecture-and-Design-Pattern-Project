
public class PrintReceipt2 extends PrintReceipt {

    public PrintReceipt2(){

    }
    public void printReceipt(DS2 d){
        System.out.println("Gallons Pumped: " + d.G + "\nYour total is: " + d.total);
    }
}
