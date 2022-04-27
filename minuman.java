public class minuman extends menu{
    private String ukuran;
    private String[]daftar_ukuran = {"Small", "Medium", "Large"};
    
    public void setUkuran(String ukuran){
        this.ukuran = ukuran;
        System.out.println(this.ukuran);
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
    protected void setHarga(double harga){
        double harga_akhir = harga;
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
