//***STRATEGY PATTERN***
//ACTION
// This is an inherited function by children, created by part of the abstract factory pattern.
// CancelMsg will print out that a transaction was cancelled.

public class CancelMsg{
    //TODO Consider changing all action parents to abstract or interface
    //Function below should see no use in the parent, and only children.
    public void cancelMsg(){
        System.out.println("Shouldn't see this");
    }
}

