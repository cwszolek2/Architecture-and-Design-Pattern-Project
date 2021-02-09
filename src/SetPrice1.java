
public class SetPrice1 extends SetPrice {
    public SetPrice1(){

    }
    public void setPrice(int g, DS1 d){
        if(g == 1)
            d.price = d.temp_a;
        else{
            System.out.println("Invalid gas type");
        }
    }
}
