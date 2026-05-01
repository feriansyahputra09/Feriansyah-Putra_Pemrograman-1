package P7;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah SKS (2 ATAU 3): ");
        int sks = in.nextInt();

        System.out.print("Masukkan Jumlah Kehadiran: ");
        int kehadiran = in.nextInt();

        System.out.print("Masukkan Nilai Tugas (0 - 100): ");
        int nilaiTugas = in.nextInt();

        System.out.print("Masukkan Nilai UTS (0 - 100): ");
        int nilaiUTS = in.nextInt();

        System.out.print("Masukkan Nilai UAS (0 - 100): ");
        int nilaiUAS = in.nextInt();

        int presentaseKehadiran = (kehadiran * 100) / ((sks == 2) ? 14 : 16);

        int hadir = presentaseKehadiran * 10/100;
        int tugas = nilaiTugas * 20/100;
        int uts = nilaiUTS * 30/100;
        int uas = nilaiUAS * 40/100;

        int nilaiAkhir = hadir + tugas + uts + uas;


        if (presentaseKehadiran >= 75) {
                System.out.println("Anda memenuhi syarat kehadiran.");
                System.out.println("Nilai anda adalah: " + nilaiAkhir);
                
                if (nilaiAkhir >= 80) {
                    System.out.println("A.");
                } else if (nilaiAkhir >= 70) {
                    System.out.println("B.");
                } else if (nilaiAkhir >= 60) {
                    System.out.println("C.");
                } else if (nilaiAkhir >= 55) {
                    System.out.println("D.");
                } else if (nilaiAkhir < 55) {
                    System.out.println("E.");
                } else {

                }
                
            } else {
                if (nilaiAkhir >= 55) {
                    System.out.println("Anda tidak memenuhi syarat kehadiran.");
                    System.out.println("Nilai anda adalah:  55, Grade anda D");
                } else {
                    System.out.println("Anda tidak memenuhi syarat kehadiran.");
                    System.out.println("Nilai anda adalah: " + nilaiAkhir + "Grade anda E.");
                    in.close();
                }
            }
        }
    }