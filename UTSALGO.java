 //BIMO RESTU PUTRO
 //227064516049
package uts.algo;
import java.util.Scanner;
public class UTSALGO {

    
    public static void main(String[] args) {
    Scanner masuk = new Scanner (System.in);//membuat scanner baru dengan "masuk"
         int pilih;//mendeklasrasikan variabel pilih
         System.out.println("===HARGA SEWA PLAYSTATION ===");//menampilkan output HARGA SEWA PLAYSTATION
         System.out.println("1.PLAYSTATION 5");//menampilkan output 1.PLAYSTATION 5
         System.out.println("2.PLAYSTATION 4");//menampilkan output 2.PLAYSTATION 4
         System.out.println("3.PLAYSTATION 3");//menampilkan output 3.PLAYSTATION 3
         System.out.println("MASUKAN PILIHAN ANDA: ");//menampilkan output MASUKAN PILIHAN ANDA:
         System.out.println("==================== ");
         pilih=masuk.nextInt();//menyimpan inputan variabel pilih
         
         if(pilih==1)//melalukan percabangan dengan if pilih==1
             System.out.println("HARGA SEWA PLAYSTATION 5 PER JAM: RP.30.000");//menampilkan output HARGA SEWA PLAYSTATION 5 PER JAM: RP.30.000
         else if(pilih==2)//melakukan percabangan dengan if pilih==2
             System.out.println("HARGA SEWA PLAYSTATION 4 PER JAM: RP.15.000");//menampilkan output HARGA SEWA PLAYSTATION 4 PER JAM: RP.15.000
         else if(pilih==3)//melakukan percabangan dengan if pilih==3
             System.out.println("HARGA SEWA PLAYSTATION 3 PER JAM: RP.10.000");//menampilkan output HARGA SEWA PLAYSTATION 3 PER JAM: RP.10.000
         else//melakukan pengecualian
             System.out.println("MAAF PILIHAN TIDAK TERSEDIA,SILAHKAN COBA LAGI!");//menampilkan output MAAF PILIHAN TIDAK TERSEDIA,SILAHKAN COBA LAGI!
         for(int i=1;i>0;i--)//melalukan perulangan
         {
             for(int j=1;j>0;j++)//melalukan perulangan for di dalam for 
             {
                 System.out.println("APAKAH ANDA SUDAH YAKIN DENGAN PILIHAN PLAYSTATION ANDA?");//menampilkan output APAKAH ANDA SUDAH YAKIN DENGAN PILIHAN PLAYSTATION ANDA?
                 System.out.println("1.YA");//menampilkan output 1.YA
                 System.out.println("2.TIDAK");//menampilkan output 2.TIDAK
                 System.out.println("PILIH: ");//menampilkan output PILIH:
                  pilih=masuk.nextInt(); //menyimpan inputan variabel pilih
                
                  if(pilih==1)//melakukan percabangan dengan if pilih==1
                      System.out.println("SELAMAT BERSENANG-SENANG");//menampilkan output SELAMAT BERSENANG-SENANG
                  else if(pilih==2)//melakukan  percabangan dengan if pilih==2
                      System.out.println("MASUKAN KEMBALI PILIHAN ANDA: ");//menampilkan output MASUKAN PILIHAN ANDA:
                      
                  pilih=masuk.nextInt();//menyimpan inputan variabel pilih
                  if(pilih==1)//melakukan percabangan dengan if pilih==1
             System.out.println("HARGA SEWA PLAYSTATION 5 PER JAM: RP.30.000");//menampilkan output HARGA SEWA PLAYSTATION 5 PER JAM: RP.30.000
         else if(pilih==2)//melakukan percabangan dengan if pilih==2
             System.out.println("HARGA SEWA PLAYSTATION 4 PER JAM: RP.15.000");//menampilkan output HARGA SEWA PLAYSTATION 4 PER JAM: RP.15.000
         else if(pilih==3)//melakukan percabangan dengan if pilih==3
             System.out.println("HARGA SEWA PLAYSTATION 3 PER JAM: RP.10.000");//menampilkan output HARGA SEWA PLAYSTATION 3 PER JAM: RP.10.000
         else
             System.out.println("MAAF PILIHAN TIDAK TERSEDIA,SILAHKAN COBA LAGI!");//menampilkan output MAAF PILIHAN TIDAK TERSEDIA,SILAHKAN COBA LAGI!
             }
    }

    }
    }



