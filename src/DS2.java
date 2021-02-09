
public class DS2 extends DataStore {
    float temp_a;
    float temp_b;
    float temp_c;
    String temp_p;
    String pin;
    float price;
    int G;
    float total;
    float rprice;
    float dprice;
    float sprice;

    public DS2(){

    }

    public void set_temp_a(float a){
        temp_a = a;
    }
    public float get_temp_a(){
        return temp_a;
    }
    public void set_temp_b(float b){
        temp_b = b;
    }
    public float get_temp_b(){
        return temp_b;
    }
    public void set_temp_c(float c){
        temp_c = c;
    }
    public float get_temp_c(){
        return temp_c;
    }
    public void set_temp_p(String p){
        temp_p = p;
    }
    public String get_temp_p(){
        return temp_p;
    }
    public void set_pin(String p){
        pin = p;
    }
    public String get_pin(){
        return pin;
    }
    public void set_price(float p){
        price = p;
    }
    public float get_price(){
        return price;
    }
    public void set_G(int gset){
        G = gset;
    }
    public int get_G(){
        return G;
    }
    public void set_rprice(float r){
        rprice = r;
    }
    public float get_rprice(){
        return rprice;
    }
    public void set_dprice(float d){
        dprice = d;
    }
    public float get_dprice(){
        return dprice;
    }
    public void set_sprice(float s){
        sprice = s;
    }
    public float get_sprice(){
        return sprice;
    }
}