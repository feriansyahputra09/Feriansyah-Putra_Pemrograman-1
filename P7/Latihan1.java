package P7;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner bacaInput = new Scanner(System.in);
        
        System.out.println("=== SISTEM PENILAIAN AKADEMIK ===");
        System.out.print("Total kehadiran mahasiswa : ");
        int absen = bacaInput.nextInt();
        
        System.out.print("Skor nilai akhir          : ");
        int skor = bacaInput.nextInt();
        System.out.println("---------------------------------");

        int standarHadir = 21 * 75 / 100; 

        if (absen >= standarHadir) {
            System.out.println("[INFO] Kehadiran memenuhi syarat.");
            System.out.println("Hasil Evaluasi: ");

            if (skor >= 80) {
                System.out.println("Grade: A (Sangat Memuaskan)");
            } else if (skor >= 70) {
                System.out.println("Grade: B (Baik)");
            } else if (skor >= 60) {
                System.out.println("Grade: C (Cukup)");
            } else if (skor >= 55) {
                System.out.println("Grade: D (Kurang)");
            } else {
                System.out.println("Grade: E (Gagal)");
            }
        } else {
            System.out.println("[PERINGATAN] Kehadiran di bawah 75%.");
            
            if (skor >= 55) {
                System.out.println("Kompensasi: Grade dipatok menjadi D");
                System.out.println("Nilai Anda : 55");
            } else {
                System.out.println("Nilai murni: " + skor);
                System.out.println("Status: E (Tidak Lulus)");
            }
        }

        bacaInput.close();
    }
}

