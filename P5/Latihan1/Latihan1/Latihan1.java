package P5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Latihan1 {

    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String bacaInput;
        int hargaMakanan;
        double hargaFinal;
        double uangBayar;

        try {
            System.out.println("Program Cek Pembayaran dengan Diskon Member");
            System.out.println("--------------------------------------------");

            System.out.print("Masukkan Harga Makanan : Rp. ");
            bacaInput = dataIn.readLine();
            hargaMakanan = Integer.parseInt(bacaInput);

            if (hargaMakanan <= 0) {
                System.out.println("Harga Makanan Tidak Valid!");
                return;
            }

            System.out.print("Apakah Anda Memiliki Kartu Member? (y/t) : ");
            bacaInput = dataIn.readLine().toLowerCase().trim();
            char member = bacaInput.charAt(0);

            hargaFinal = hargaMakanan;

            System.out.println("--------------------------------------------");

            if (member == 'y') {
                if (hargaMakanan >= 100000) {
                    double diskon = hargaMakanan * 0.15;
                    hargaFinal = hargaMakanan - diskon;
                    System.out.println("Selamat! Anda Mendapat Diskon 15%.");
                    System.out.println("Potongan Diskon : Rp. " + diskon);
                } else if (hargaMakanan >= 50000) {
                    double diskon = hargaMakanan * 0.10;
                    hargaFinal = hargaMakanan - diskon;
                    System.out.println("Selamat! Anda Mendapat Diskon 10%.");
                    System.out.println("Potongan Diskon : Rp. " + diskon);
                } else {
                    System.out.println("Maaf, Belanja Minimum Rp. 50.000 untuk Mendapat Diskon.");
                }
            } else if (member == 't') {
                System.out.println("Anda Tidak Memiliki Kartu Member, Tidak Ada Diskon.");
            } else {
                System.out.println("Pilihan Tidak Valid! Masukkan 'y' atau 't'.");
                return;
            }

            System.out.println("Total Harga yang Harus Dibayar : Rp. " + hargaFinal);
            System.out.println("--------------------------------------------");

            System.out.print("Masukkan Jumlah Uang yang Dibayarkan : Rp. ");
            bacaInput = dataIn.readLine();
            uangBayar = Double.parseDouble(bacaInput);

            System.out.println("--------------------------------------------");

            if (uangBayar <= 0) {
                System.out.println("Jumlah Uang Tidak Valid!");
            } else if (uangBayar < hargaFinal) {
                System.out.println("Uang yang Dibayarkan Kurang!");
                System.out.println("Kekurangan : Rp. " + (hargaFinal - uangBayar));
            } else if (uangBayar == hargaFinal) {
                System.out.println("Pembayaran Berhasil. Terima Kasih!");
                System.out.println("Kembalian : Rp. 0");
            } else {
                double kembalian = uangBayar - hargaFinal;
                System.out.println("Pembayaran Berhasil. Terima Kasih!");
                System.out.println("Kembalian Anda : Rp. " + kembalian);
            }

        } catch (IOException e) {
            System.out.println("Ada Kesalahan Membaca Input!");
        } catch (NumberFormatException e) {
            System.out.println("Input Harus Berupa Angka!");
        }
    }
}