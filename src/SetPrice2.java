//**STRATEGY PATTERN**
//ACTION
// A child of SetPrice, this is a created as a part of the GasPump2 process.
//Sets price to a certain amount.
public class SetPrice2 extends SetPrice {
    public SetPrice2(){

    }
    @Override
    public void setPrice(int g, DataStore ds){
        DS2 d = (DS2) ds;
        if( g == 1){
            d.price = d.rprice;
        }
        else if (g == 2){
            d.price = d.sprice;
        } else if (g == 3) {
            d.price = d.dprice;
        }
    }
}
