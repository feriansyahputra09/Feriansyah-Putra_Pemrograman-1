import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double TotalSemua = 0;
        
        for (int i = 1; i <= 7; i++) {
            System.out.println("\nHari Ke-" + i);
            System.out.print("Makan        : ");
            double Makan = input.nextDouble();
            System.out.print("Transport     : ");
            double Transport = input.nextDouble();
            System.out.print("Belanja       : ");
            double Belanja = input.nextDouble();
            
            double Total = Makan + Transport + Belanja;
            TotalSemua= TotalSemua + Total;
            
            System.out.println("\nHitung Total : ");
            System.out.println("Total = " + Makan + " + " + Transport + " + " + Belanja + " = " + Total);
            
            System.out.println("\nPresentase : ");
            System.out.println("Makan   = (" + Makan + " / " + Total + ") x 100 = " + (int)((Makan / Total) * 100) + "%");
            System.out.println("Transport   = (" + Transport + " / " + Total + ") x 100 = " + (int)((Transport / Total) * 100) + "%");
            System.out.println("Belanja   = (" + Belanja + " / " + Total + ") x 100 = " + (int)((Belanja / Total) * 100) + "%");
        }
        
        double RataRata = TotalSemua /7;
        System.out.println("\n=== Hasil Akhir ===");
        System.out.println("TotalSemua : " + TotalSemua);
        System.out.println("RataRata : " + RataRata);
    }
}
 
   