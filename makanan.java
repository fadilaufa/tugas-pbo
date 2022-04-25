public class makanan{
    private String topping;
    private String[]daftar_topping = {"Sosis", "Telur", "Keju"};
    private int []harga_topping = {3000, 1500, 3000};
    
    public void setTopping(String topping){
        this.topping = topping;
    }
    
    public String getTopping (){
        return this.topping;
    }
    
    public int getHargatopping(){
        int harga = 0;
        for (int i = 0; i< daftar_topping.length; i++){
            if (daftar_topping[i] == topping) {
                harga = harga_topping[i];
                break;
            }
        }
        return harga;
    }
    
}
