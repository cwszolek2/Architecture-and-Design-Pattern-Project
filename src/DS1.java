
public class DS1 extends DataStore {
    int temp_c;
    int cash;
    int total;
    int L;
    int price;
    int temp_a;
    int w;

    public DS1(){

    }

    public void set_temp_a(int a){
        temp_a = a;
    }
    public int get_temp_a(){
        return temp_a;
    }
    public void set_temp_c(int c){
        temp_c = c;
    }
    public int get_temp_c(){
        return temp_c;
    }
    public void set_cash(int c){
        cash = c;
    }
    public int get_cash(){
        return cash;
    }
    public void set_total(int t){
        total = t;
    }
    public int get_total(){
        return total;
    }
    public void set_L(int lset){
        L = lset;
    }
    public int get_L(){
        return L;
    }
    public void set_price(int p){
        price = p;
    }
    public int get_price(){
        return price;
    }
    public void set_w(int wset){
        w = wset;
    }


}