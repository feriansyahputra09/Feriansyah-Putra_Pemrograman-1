import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("=== INPUT NILAI ===");
        System.out.print("Masukkan Jumlah Presensi : ");
        int Presensi = input.nextInt();
        
        System.out.print("Masukkan Realisasi : ");
        int Realisasi = input.nextInt();
       
        System.out.print("Nilai Tugas : ");
        double Tugas = input.nextDouble();
        
        System.out.print("Nilai UTS : ");
        double UTS = input.nextDouble();
        
        System.out.print("Nilai UAS : ");
        double UAS = input.nextDouble();
        
        double NilaiPresensi = (double) Presensi / Realisasi * 10;
        double NilaiTugas = Tugas * 0.2;
        double NilaiUTS = UTS * 0.3;
        double NilaiUAS = UAS * 0.4;
        double NilaiAkhir = NilaiPresensi + NilaiTugas + NilaiUTS + NilaiUAS;
        
        System.out.println("\n=== HASIL ===");
        System.out.println("Nilai Presensi : " + NilaiPresensi);
        System.out.println("Nilai Tugas : " + NilaiTugas);
        System.out.println("Nilai UTS : " + NilaiUTS);
        System.out.println("Nilai UAS : " + NilaiUAS);
        System.out.println("NilaiAkhir : " + NilaiAkhir);
        }
}    