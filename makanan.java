public class makanan extends menu implements pesanan {
    private String topping;
    private String[] daftar_makanan = {"Roti Bakar", "Mie Goreng", "Mie Rebus", "Pisang Crispy", "French Fries", "Sosis"};
    private double[] daftar_harga = {10000, 12000, 12000, 15000, 15000, 15000};
    private String[]daftar_topping = {"sosis", "telur", "keju"};
    private int []harga_topping = {3000, 1500, 3000};
    
    @Override
    protected void setNama(){
        int pil;
        System.out.println("=== Daftar Menu ===");
        for (int i = 0; i < daftar_makanan.length; i++){
            System.out.println(i+1 + ". " + daftar_makanan[i] + "\t| Rp. " + daftar_harga[i]);
        }
        System.out.print("Masukkan Pilihan : ");
        pil = input.nextInt();
        this.id = pil - 1;
        this.nama = daftar_makanan[pil-1];
    }
    
    public void setTopping(int pil){
        this.topping = this.daftar_topping[pil];
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
    protected void setHarga(){
       double harga_akhir = daftar_harga[id];
       double harga_topping = getHargatopping();
    
       harga_akhir = harga_akhir + harga_topping;   
       harga_akhir = harga_akhir * super.getJumlah();
       
       super.harga = harga_akhir;
    }
    
    @Override
    public void tampil_pesanan(){
       System.out.println("Nama = " + getNama());
       System.out.println("Topping = " + getTopping() + " | Rp. " + getHargatopping());
       System.out.println("Quantity = " + getJumlah());
       System.out.println("Price = " + getHarga());
    }
    
}
