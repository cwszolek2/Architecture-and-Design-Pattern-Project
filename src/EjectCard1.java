//***STRATEGY PATTERN***
//ACTION

//A child of EjectCard, this is a created as a part of the GasPump1 process.
//Prints a message that a card was ejected.
public class EjectCard1 extends EjectCard {
    public EjectCard1(){
    }
    @Override
    public void ejectCard() {
        System.out.println("Ejecting Card.");
    }
}
