import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class main {
   public static void main(String[] args) throws IOException {
       //INISIASI
       String nama, topping;
       int qty;
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
               System.out.print("Nama = ");
               nama = br.readLine();
               food.setNama(nama);

               food.tampilTopping();
               System.out.print("Topping = ");
               topping = br.readLine();
               food.setTopping(topping);

               System.out.print("Jumlah = ");
               qty = input.nextInt();
               food.setJumlah(qty);
               
               System.out.print("Harga = ");
               harga = input.nextDouble();
               food.setHarga(harga);

               System.out.println(" ");
               System.out.println("=== validasi pesanan ===");
               food.tampil_pesanan();
               
               total = food.getHarga();
           }else{
              System.out.println("coming soon");
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