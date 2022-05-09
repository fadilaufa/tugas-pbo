import java.util.Scanner;
public class menu {
    public Scanner input = new Scanner(System.in);
    public String nama;
    public double harga;
    public int jumlah;
    
    protected menu(){
        this.nama="";
        this.harga=0;
        this.jumlah=0;
    }
    
    protected void setNama(){
        this.nama = "";
    }
    
    protected String getNama(){
        return this.nama;
    }
    
    protected void setHarga(){
        this.harga = 0;
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
