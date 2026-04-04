import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            
            String Nama;
            int Umur;
            
            System.out.print("Masukkan Nama: ");
            Nama = input.nextLine();
            
            System.out.print("Masukkan Umur: ");
            Umur = input.nextInt();
            input.nextLine();
            
            System.out.println("\n=== Data Diri == ");
            System.out.println("nama   :" + Nama);
            System.out.println("umur   :" + Umur + " tahun ");
        }
}       