//**STRATEGY PATTERN**
//ACTION
// This is an inherited function by children, created by part of the abstract factory pattern.
//Sets the price in the datastore to a certain value (usually 0)
public class InitializeData {
    public void initializeData(){
        System.out.println("Shouldn't see this1");
    }
    public void initializeData(DataStore d){System.out.println("Shouldn't see this2");}
}

