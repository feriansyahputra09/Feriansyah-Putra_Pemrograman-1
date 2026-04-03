import java.util.Scanner;

public class Tugas1 {
    public static void main (String[] args) {
          
    String[] Hari = {"Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"};

    double Makan[] = {20000,25000,22000,18000,30000,35000,40000};
    double Transport[] = {10000,10000,12000,10000,15000,5000,0};
    double Belanja[] = {50000,30000,20000,60000,80000,100000,70000};

    double total = 0;

    for (int i = 0; i < 7; i++) {
    double Jumlah = Makan[i] + Transport[i] + Belanja[i];

    System.out.println(Hari[i] + " + " +Jumlah);

    total = total + Jumlah;
    }
    
    Double RataRata = total /7;
    
    System.out.println("\nTotal = " + total);
    System.out.println("Rata-Rata = " + RataRata);
      }
}
