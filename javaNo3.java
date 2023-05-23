//BIMO RESTU PUTRO
//227064516049
package uts;
import java.util.Scanner;
public class javaNo3 {
     public static void main(String[] args) {
         Scanner masuk= new Scanner(System.in);//membuat scanner baru dengan "masuk"

        // Menampilkan judul program
        System.out.println("// COLDPLAY MUSIC CONCERT PERFORMENCE //");
        System.out.println("========== WORLD TOUR ==========");
        System.out.println("GELORA BUNG KARNO STADIUM JAKARTA");
        
        // Menampilkan kategori tiket yang tersedia
        System.out.println("Kategori tiket yang tersedia:");
        System.out.println("1. ULTIMATE EXPERIENCE (CAT1) IDR 11.000.000");
        System.out.println("2. MY UNIVERSE (FESTIVAL) IDR 5.700.000");
        System.out.println("3. CAT1 (NUMBERED SEATING)IDR 5.000.000");
        System.out.println("4. CAT2 (NUMBERED SEATING)IDR 4.000.000");
        System.out.println("5. CAT3 (NUMBERED SEATING)IDR 3.250.000");
        System.out.println("6. CAT4 (NUMBERED SEATING)IDR 2.500.000");
        
        // Mengambil input dari pengguna
        System.out.print("Pilih kategori tiket (1-6): ");
        int Cat = masuk.nextInt();//menyimpan inputan variabel cat
        System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
        int jumlah = masuk.nextInt();//menyimpan inputan variabel jumlah
        
        // Menghitung total harga
        int harga = 0;//mendeklarasikan variabel harga
        switch (Cat) {//membuat switch untuk variabel cat
            case 1:
                harga = 11000000;//jumlah harga pada case 1
                break;//berhenti
            case 2:
                harga = 5700000;//jumlah harga pada case 2
                break;//berhenti
            case 3:
                harga = 5000000;//jumlah harga pafa case 3
                break;//berhenti
            case 4:
                harga = 4000000;//jumlah harga pada case 4
                break;//berhenri
            case 5: 
                harga = 3200000;//jumlah harga pada case 5
                break;//berhenri
            case 6:
                harga = 2500000;//jumlah harga pada case 6
                break;  //berhenri      
            default:
                System.out.println("Kategori tiket tidak valid.");//pengecualian
                return;//kembali
        }
        int total = harga * jumlah;//deklarasi variabel total sama dengan variaabel harga di kalikan variabel jumlah
        
        // Menampilkan invoice pembelian
        System.out.println("=============================================");
        System.out.println(" INVOICE PEMBELIAN");
        System.out.println("=============================================");
        System.out.println("Kategori Tiket: Cat " + Cat);
        System.out.println("Jumlah Tiket : " + jumlah);
        System.out.println("Harga Tiket : Rp" + total);
        System.out.println("=============================================");
        
        // Mengambil input jumlah uang yang akan dibayarkan
        System.out.print("Masukkan jumlah uang yang akan dibayarkan: ");
        int pembayaran = masuk.nextInt();//menyimpan inputan di variabelpembayaran
        
        // Menghitung kembalian
        int kembalian = pembayaran - total;//deklarasi variabel kembalian sama dengan variabel pembayaran - total
        
        // Menampilkan kembalian
        System.out.println("Kembalian : Rp" + kembalian);//menampilkan variabel kembalian
}
}