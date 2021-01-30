//**STRATEGY PATTERN**
//ACTION
// A child of SetPrice, this is a created as a part of the GasPump1 process.
//Sets price to a certain amount.
public class SetPrice1 extends SetPrice {
    public SetPrice1(){

    }
    @Override
    public void setPrice(int g, DataStore ds){
        DS1 d = (DS1) ds;
        if(g == 1)
            d.price = d.temp_a;
        else{
            System.out.println("Invalid gas type");
        }
    }
}
