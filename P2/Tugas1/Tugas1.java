import java.util.Scanner;

public class Tugas1 {
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
       
       System.out.println("\n=== Data Diri Lengkap ===");
       System.out.println("nama     :" + nama);
       System.out.println("umur     :" + umur);
       System.out.println("hobi     :" + hobi);
       System.out.println("alamat   :" + alamat);
    }
}