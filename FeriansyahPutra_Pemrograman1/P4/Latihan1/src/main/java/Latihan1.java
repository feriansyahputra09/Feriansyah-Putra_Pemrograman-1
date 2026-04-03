import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Hadir: ");
        int h = sc.nextInt();
        
        System.out.print("Total: ");
        int t = sc.nextInt();
        
        System.out.print("Tugas: ");    
        double tug = sc.nextDouble();
        
        System.out.print("UTS: ");
        double u = sc.nextDouble();
        
        System.out.print("UAS: ");
        double ua = sc.nextDouble();
        
        double na = (h * 1.0 / t) * 10 + tug * 0.2 + u * 0.3 + ua * 0.4;
        
        System.out.println("Nilai: " + (int)(na * 100) / 100.0);
        
        sc.close();
    }
} 