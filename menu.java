public class menu {
    public String nama;
    public double harga;
    public int jumlah;
    
    protected menu(){
        this.nama="";
        this.harga=0;
        this.jumlah=0;
    }
    
    protected void setNama(String nama){
        this.nama = nama;
    }
    
    protected String getNama(){
        return this.nama;
    }
    
    protected void setHarga(double harga){
        this.harga = harga;
    }
    
    protected double getHarga(){
        return this.harga;
    }
    
    protected void setJumlah(int j){
        this.jumlah = j;
    }
    
    protected int getJumlah(){
        return this.jumlah;
    }

}
