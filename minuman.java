public class minuman extends menu{
    private String ukuran;
    private String[]daftar_ukuran = {"Small", "Medium", "Large"};
    private String[] daftar_minuman = {"Capuccino", "Kopi Susu", "Espresso", "Latte", "Milkshake Vanilla", "Milkshake Coklat"};
    private String[]daftar_ukuran = {"Small", "Medium", "Large"};
    
    @Override
    protected void setNama(){
        int pil;
        System.out.println("=== Daftar Menu ===");
        for (int i = 0; i < daftar_minuman.length; i++){
            System.out.println(i+1 + ". " + daftar_minuman[i] + "\t| Rp. " + daftar_harga[i]);
        }
        System.out.print("Masukkan Pilihan : ");
        pil = input.nextInt();
        this.id = pil - 1;
        this.nama = daftar_minuman[pil-1];
    }
    
    public void setUkuran(String ukuran){
        this.ukuran = ukuran;
    }
    
    public String getUkuran (){
        return this.ukuran;
    }
    
    public void tampilUkuran() {
        System.out.println("=== Daftar Ukuran ===");
        for (int i = 0; i < daftar_ukuran.length; i++){
            System.out.println((i+1) + ". " + daftar_ukuran[i] );
        }
    }
    public void tampil_pesanan(){
       System.out.println("Nama = " + getNama());
       System.out.println("Size = " + getUkuran());
       System.out.println("Quantity = " + getJumlah());
       System.out.println("Price = " + getHarga());
    }
    
    @Override
    protected void setHarga(){
        double harga_akhir = this.daftar_harga[id];
        double harga_ukuran;
        harga_ukuran = harga_akhir * 15/100;
        if (daftar_ukuran[0].equals(getUkuran())){
            harga_akhir = harga_akhir - harga_ukuran;
        } else if (daftar_ukuran[2].equals(getUkuran())){
            harga_akhir = harga_akhir + harga_ukuran;
        }
        
        harga_akhir = harga_akhir * super.getJumlah();
        
        super.harga = harga_akhir;
    }
}
