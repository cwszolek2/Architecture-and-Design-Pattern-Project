//***STRATEGY PATTERN***
//ACTION

//A child of EjectCard, this is a created as a part of the GasPump2 process.
//Prints a message that a card was ejected.
public class EjectCard2 extends EjectCard {

    public EjectCard2(){

    }
    @Override
    public void ejectCard() {
        System.out.println("Ejecting Card.");
    }
}
