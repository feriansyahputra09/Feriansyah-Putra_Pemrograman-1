import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double Kehadiran, Tugas, UTS, UAS, NilaiAkhir;
        
        System.out.print("Nilai Kehadiran : ");
        Kehadiran = sc.nextDouble();
        
        System.out.print("Nilai Tugas : ");
        Tugas = sc.nextDouble();
        
        System.out.print("Nilai UTS : ");
        UTS = sc.nextDouble();
        
        System.out.print("Nilai UAS : ");
        UAS = sc.nextDouble();
        
        NilaiAkhir = (Kehadiran * 0.1) + (Tugas * 0.2) + (UTS * 0.3) + (UAS * 0.4);
        
        System.out.println("NilaiAkhir = " + NilaiAkhir);
    }
}