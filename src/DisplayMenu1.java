//***STRATEGY PATTERN***
//ACTION
//A child of DisplayMenu, this is a created as a part of the GasPump1 process.
//Prints menu for user display
public class DisplayMenu1 extends DisplayMenu {
    public DisplayMenu1(){
    }
    @Override
    public void displayMenu(){
        System.out.println("Gas Type Selected: Regular Type");
        System.out.println("Menu:");
        System.out.println("Cancel");
        System.out.println("Start Pump");


    }

}
