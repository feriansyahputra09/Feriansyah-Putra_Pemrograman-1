import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            
            String Nama;
            int Umur;
            
            System.out.print("Masukkan Nama: ");
            Nama = input.nextLine();
            
            System.out.print("Masukkan Umur: ");
            Umur = input.nextInt();
            input.nextLine();
            
            System.out.print("\n=== Data Diri ==-");
            System.out.print("nama   :" + Nama);
            System.out.print("umur   :" + Umur + " tahun ");
        }
}       