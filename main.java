import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class main {
   public static void main(String[] args) throws IOException {
       //INISIASI
       String nama;
       int qty, topping, ukuran;
       double harga, total = 0, totalbayar = 0;;
       int type,next;
       double temp;
       boolean pil;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       Scanner input = new Scanner(System.in);
       makanan food = new makanan();


       System.out.println("== Menu Pembayaran Cafe ==");
       System.out.println("Masukan Detail Pemesanan :");

       do{
           System.out.println("Jenis Pesanan : ");
           System.out.println("1. Makanan");
           System.out.println("2. minuman");
           System.out.println("masukan pilihan : ");
           System.out.print("> ");
           type = input.nextInt();

           if(type == 1){
               food.setNama();

               food.tampilTopping();
               System.out.print("Masukkan Pilihan : ");
               topping = input.nextInt();
               food.setTopping(topping - 1);

               System.out.print("Jumlah = ");
               qty = input.nextInt();
               food.setJumlah(qty);
               
               food.setHarga();

               System.out.println(" ");
               System.out.println("=== validasi pesanan ===");
               food.tampil_pesanan();
               
               total = food.getHarga();
           }else if (type == 2){
               
               drink.setNama();

               drink.tampilUkuran();
               System.out.print("Masukkan Pilihan = ");
               ukuran = input.nextInt();
               drink.setUkuran(ukuran - 1);

               System.out.print("Jumlah = ");
               qty = input.nextInt();
               drink.setJumlah(qty);
               
               drink.setHarga();

               System.out.println(" ");
               System.out.println("=== validasi pesanan ===");
               drink.tampil_pesanan();
               
               total = drink.getHarga();
           }
           
           totalbayar = totalbayar + total;
           total = 0;

           System.out.println();
           System.out.println("tambah pesanan ? y/n");
           System.out.print("> ");
           next = input.next().charAt(0);
           if(next == 'y'){
               pil = true;
           }else{
               break;
           }
       }while(pil = true);

       System.out.println("Total harga pesanan anda adalah = " + totalbayar);
   }
}
