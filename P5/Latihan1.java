package P5;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] ages = new int[5];
        
        System.out.println("--- Program Input Data Usia ---");
        
        for (int i = 0; i < ages.length; i++ ) {
            System.out.print("Masukkan Usia untuk indeks ke-" + i + ": ");
            ages[i] = input.nextInt();   
        }
        
        System.out.println("\n--- Daftar Usia Yang Tersimpan ---");
        for(int i =0; i < ages.length; i++) {
            System.out.print(ages[i] + " ");
        }
        
        System.out.println("\n\nProses Selesai.");
        input.close();
    }
}