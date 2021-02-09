
public class PrintReceipt1 extends PrintReceipt {

    public PrintReceipt1(){

    }
    public void printReceipt(DS1 d){
        System.out.println("Liters Pumped: " + d.L + "\nYour total is: " + d.total);
    }
}
