public class makanan extends menu{
    private String topping;
    private String[]daftar_topping = {"sosis", "telur", "keju"};
    private int []harga_topping = {3000, 1500, 3000};
    
    public void setTopping(String topping){
        this.topping = topping;
    }
    
    public String getTopping (){
        return this.topping;
    }
    
    public int getHargatopping(){
        int harga = 0;
        for (int i = 0; i < 3; i++){
            if (daftar_topping[i].equals(getTopping())) {
                harga = harga_topping[i];
                break;
            }
        }
        return harga;
    }
    
    public void tampilTopping() {
        System.out.println("=== Daftar Topping ===");
        for (int i = 0; i < daftar_topping.length; i++){
            System.out.println((i+1) + ". " + daftar_topping[i] + "\t| Rp. " + harga_topping[i]);
        }
    }
    
    @Override
    protected void setHarga(double harga){
       double harga_akhir = harga;
       double harga_topping = getHargatopping();
    
       harga_akhir = harga_akhir + harga_topping;   
       harga_akhir = harga_akhir * super.getJumlah();
       
       super.harga = harga_akhir;
    }
    
    public void tampil_pesanan(){
       System.out.println("Nama = " + getNama());
       System.out.println("Topping = " + getTopping() + " | Rp. " + getHargatopping());
       System.out.println("Quantity = " + getJumlah());
       System.out.println("Price = " + getHarga());
    }
}
