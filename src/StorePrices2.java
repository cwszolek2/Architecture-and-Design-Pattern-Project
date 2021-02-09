
public class StorePrices2 extends StorePrices {
    public StorePrices2(){

    }
    public void storePrices(DS2 d){
        d.rprice = d.temp_a;
        d.sprice = d.temp_b;
        d.dprice = d.temp_c;
    }
}
