import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        
        System.out.println("===================================");
        System.out.println("Program Hitung Ongkos Kirim Paket");
        System.out.println("===================================");
        
        System.out.print(" BeratPaket (kg)   : ");
        double BeratPaket = input.nextDouble();
        
        System.out.print("Jarak Pengiriman (km) : ");
        double JarakPengiriman = input.nextDouble();
        
        System.out.print("JumlahPaket          : ");
        double JumlahPaket = input.nextDouble();
        
        double BiayaBerat = BeratPaket *5000;
        double BiayaJarak = JarakPengiriman * 2000;
        double subtotal = (BiayaBerat + BiayaJarak) * JumlahPaket;
        double Diskon = subtotal * 0.10;
        double TotalOngkir = subtotal - Diskon;
        
        System.out.println("\n================================");
        System.out.println("      Rincian Biaya");
        System.out.println("================================");
        
        System.out.println("BiayaBerat          : Rp " + BiayaBerat);
        System.out.println("BiayaJarak          : Rp " + BiayaJarak);
        System.out.println("subtotal            : Rp " + subtotal);
        System.out.println("Diskon 10%          : Rp " + Diskon);
        System.out.println("TotaalOngkosKirim   : Rp " + TotalOngkir);
        System.out.println("================================");
        System.out.println("Paket segera dikirim! Terima kasih!");
        System.out.println("================================");
        
        input.close();
     }
}
 