
public class SetPrice2 extends SetPrice {
    public SetPrice2(){

    }
    public void setPrice(int g, DS2 d){
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
