//***STRATEGY PATTERN***
//ACTION
//A child of DisplayMenu, this is a created as a part of the GasPump1 process.
//Prints menu for user display
public class DisplayMenu2 extends DisplayMenu {

    public DisplayMenu2(){

    }
    @Override
    public void displayMenu(){
        System.out.println("Menu:");
        System.out.println("Gas Types:");
        System.out.println("Unleaded, Diesel, Super");
        System.out.println("Select Gas");
        System.out.println("Cancel");
        System.out.println("Start Pump");

    }
}
