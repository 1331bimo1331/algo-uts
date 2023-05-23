//BIMO RESTU PUTRO
//227064516049
package uts;
import java.util.Scanner;
public class javaNo2 {
     public static void main(String[] args) {
             Scanner input = new Scanner(System.in); //scanner belum di import
        
        System.out.println("## Program Java Cari Nilai Rata-rata ##"); // tidak menggunakan ""
        System.out.println("=================================");
        System.out.println();
        int[] arr = new int[100];
        int arr_count, i;
        float total, rata2;
        System.out.println("Input jumlah element array: ");
        arr_count = input.nextInt();
        System.out.println("Input " + arr_count + " angka (dipisah dengan enter): ");
        
        // simpan setiap angka yang diinput ke dalam array
        for (i = 0; i < arr_count; i++){
            arr[i] = input.nextInt(); // ganti ke next int karna tipe datanya integer
        }
        
        System.out.println();
        
        // cari total semua elemen array
        total = 0;
        for (i = 0; i < arr_count; i++){
            total = total + arr[i];
        }
        
        rata2 = (total/arr_count);
        System.out.println("Nilai  rata-rata dari " + arr_count + " inputan adalah : " + rata2); // tambah + sebelum arr_count
    }   
}

// Error yang ada pada program diatas :
/*
    1. System.out.println(## Program Java Cari Nilai Rata-rata ##); -> terjadi error karena tidak menggunakan tanda kutip. string yang ingin dicetak harus ditempatkan
    dalam tanda kutip (""). diubah menjadi 
    1. Scanner input = new Scanner(System.in); -> terjadi error pada bagian ini karna Scanner belum di import ke dalam project java,
    maka perlu ditambahkan import java.util.Scanner; pada bagian atas project
    2. arr[i] = input.nextDouble(); -> terjadi error karena arr[i] dideklarasikan dengan tipe data Integer sedangkan fungsi yang digunakan
    untuk menerima inputan adalah nextDouble() yang menerima inputan dengan tipe data Double.
    maka perlu diganti menjadi arr[i] = input.nextInt();
    3. System.out.println("Nilai  rata-rata dari " arr_count " inputan adalah : " + rata2); -> terjadi error pada bagian penulisan variabel arr_count karena
    tidak menggunakan operator penggabung (+), maka perlu ditambahkan operator penggabung "+" untuk menghubungkan string dan variabel
    diperbaiki menjadi System.out.println("Nilai  rata-rata dari " + arr_count + " inputan adalah : " + rata2);
*/