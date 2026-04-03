import java.util.Scanner;

public class Latihan1 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        
       String nama, hobi, alamat;
       int umur;
       
       System.out.print("Masukkan nama: ");
       nama = input.nextLine();
       
       System.out.print("Masukkan umur: ");
       umur = input.nextInt();
       input.nextLine();
       
       System.out.print("Masukkan hobi: ");
       hobi = input.nextLine();
       
       System.out.print("Masukkan alamat: ");
       alamat = input.nextLine();
       
       System.out.print("\n=== Data Diri Lengkap ===");
       System.out.print("nama     :" + nama);
       System.out.print("umur     :" + umur);
       System.out.print("hobi     :" + hobi);
       System.out.print("alamat   :" + alamat);
    }
}