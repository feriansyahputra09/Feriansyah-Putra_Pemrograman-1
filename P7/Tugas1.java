package P7;

import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            System.out.println("---------------------------------");
            System.out.println("     PORTAL DATA MAHASISWA       ");
            System.out.println("---------------------------------");
            System.out.println("1. Cek Grade Nilai");
            System.out.println("2. Input Pengeluaran Mingguan");
            System.out.println("3. Keluar Program");
            System.out.print("Pilih menu [1-3]: ");
            
            int opsi = inputan.nextInt();

            switch (opsi) {
                case 1:
                    prosesNilai(inputan);
                    break;
                case 2:
                    prosesKeuangan(inputan);
                    break;
                case 3:
                    lanjut = false;
                    System.out.println("Selesai. Sampai jumpa!");
                    break;
                default:
                    System.out.println("Input salah, coba lagi.");
            }
        }
    }

    public static void prosesNilai(Scanner scan) {
        System.out.println("\n--- MODUL EVALUASI NILAI ---");
        
        int absen = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print("Total Hadir (Max 21): ");
            absen = scan.nextInt();
            if (absen >= 0 && absen <= 21) {
                valid = true;
            } else {
                System.out.println("Error: Input harus antara 0 - 21!");
            }
        }

        System.out.print("Masukkan Skor Akhir : ");
        int skor = scan.nextInt();

        boolean cekAbsensi = absen >= (21 * 75 / 100);
        
        if (!cekAbsensi && skor >= 55) {
            skor = 55;
        }

        String grade;
        if (skor >= 80) {
            grade = "A";
        } else if (skor >= 70) {
            grade = "B";
        } else if (skor >= 60) {
            grade = "C";
        } else if (skor >= 55) {
            grade = "D";
        } else {
            grade = "E";
        }

        System.out.println("Status Absen : " + (cekAbsensi ? "Lengkap" : "Kurang"));
        System.out.println("Grade Akhir  : " + grade + " (Nilai: " + skor + ")");

        navigasiKembali(scan);
    }

    public static void prosesKeuangan(Scanner scan) {
        System.out.println("\n--- MODUL CATATAN KEUANGAN ---");
        
        String[] posBiaya = {"Makan", "Transport", "Kebutuhan"};
        double[] rekapan = new double[3];
        double totalGlobal = 0;

        for (int hari = 0; hari < 7; hari++) {
            System.out.println("Day " + (hari + 1) + ":");
            double subTotal = 0;

            for (int k = 0; k < 3; k++) {
                System.out.print(" > Biaya " + posBiaya[k] + ": ");
                double harga = scan.nextDouble();
                rekapan[k] += harga;
                subTotal += harga;
            }
            
            if (subTotal > 0) {
                System.out.println("Subtotal Hari ini: Rp " + subTotal + "\n");
            }
            totalGlobal += subTotal;
        }

        System.out.println("========== REKAP 7 HARI ==========");
        for (int i = 0; i < 3; i++) {
            System.out.println("Total " + posBiaya[i] + " : Rp " + rekapan[i]);
        }
        System.out.println("Total Semua : Rp " + totalGlobal);

        navigasiKembali(scan);
    }

    public static void navigasiKembali(Scanner scan) {
        System.out.print("\nBalik ke menu? (y/n): ");
        String konfirmasi = scan.next();
        
        if (!konfirmasi.equalsIgnoreCase("y")) {
            System.out.println("Program dihentikan.");
            System.exit(0);
        }
    }
}