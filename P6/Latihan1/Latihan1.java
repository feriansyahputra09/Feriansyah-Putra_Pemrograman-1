package P6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Latihan1 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String bacaInput;
        int HargaMakanan;
        double HargaFinal;
        double UangBayar;
        
        try {
            System.out.println("Program Cek Pembayaran Dengan Diskon Member");
            System.out.println("-------------------------------------------");
            
            System.out.print("Masukkan Harga Makanan : Rp. ");
            bacaInput = dataIn.readLine();
            HargaMakanan = Integer.parseInt(bacaInput);
            
            if (HargaMakanan <= 0) {
                System.out.println("Harga Makanan Tidak Valid! ");
                return;
            }
            
            System.out.print("Apakah Anda Memiliki Kartu Member? (y/t) : ");
            bacaInput = dataIn.readLine().toLowerCase().trim();
            char Member = bacaInput.charAt(0);
            
            HargaFinal = HargaMakanan;
            
            System.out.println("----------------------------------");
            
            if (Member == 'y') {
                if (HargaMakanan >= 100000 ) {
                    double diskon = HargaMakanan * 0.15;
                    HargaFinal = HargaMakanan - diskon;
                    System.out.println("Selamat Anda Mendapatkan Diskon 15%. ");
                    System.out.println("Potongan Diskon : Rp. " + diskon);
                } else if (HargaMakanan >= 50000) {
                    double diskon = HargaMakanan * 0.10;
                    HargaFinal = HargaMakanan - diskon;
                    System.out.println("Selamat Anda Mendapatkan Diskon 10%. ");
                    System.out.println("Potongan Diskon : Rp. " + diskon);
                } else {
                    System.out.println("Maaf, Belanja Minimum Rp. 50.000 untuk Mendapat Diskon.");
                }
                
                } else if (Member == 'y') {
                    System.out.println("Anda Tidak Memiliki Kartu Member, Tidak Ada Diskon.");
                } else {
                    System.out.println("Pilihan Tidak Valid! Masukkan 'y' atau 't'.");
                    return;
                }
                
                System.out.println("Total Harga Yang Harus Dibayar : Rp. " + HargaFinal);
                System.out.println("--------------------------------------------------");
                
                System.out.print("Masukkan Jumlah Uang Yang Dibayarkan : Rp. ");
                bacaInput = dataIn.readLine();
                UangBayar = Double.parseDouble(bacaInput);
                
                System.out.println("--------------------------------------");
                
                if (UangBayar < HargaFinal) {
                    System.out.println("Uang Yang Dibayarkan Kurang! ");
                    System.out.println("Kekurangan : Rp. " + (HargaFinal - UangBayar));
                } else if (UangBayar == HargaFinal) {
                    System.out.println("Pembayaran Berhasil. Terima Kasih! ");
                    System.out.println("Kembalian : Rp. 0 ");
                } else {
                    double Kembalian = UangBayar - HargaFinal;
                    System.out.println("Pembayaran Berhasil. Terima Kasih! ");
                    System.out.println("Kembalian Anda : Rp. " + Kembalian);
                }    
            } catch (IOException e) {
                System.out.println("Ada Kesalahan Membaca Input! ");
            } catch (NumberFormatException e) {
                System.out.println("Input Harus Berupa Angka! ");            
        }
    }
}