package P5;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Berapa banyak angka yang ingin diinput? ");
        int size = scan.nextInt();
        int[] koleksiAngka = new int[size];
        
        System.out.println("--- Masukkan Data ---");
        for (int i = 0; i < size; i++) {
            System.out.print("Nilai ke-" + (i + 1) + ": ");
            koleksiAngka[i] = scan.nextInt();
        }
        
        if (size > 0) {
            int palingBesar = koleksiAngka[0];
            int palingKecil = koleksiAngka[0];

            for (int x : koleksiAngka) {
                if (x > palingBesar) palingBesar = x;
                if (x < palingKecil) palingKecil = x;
        }
            
        for (int i = 0; i < size - 1; i++) {
                for (int j = 0; j < size - i - 1; j++) {
                    if (koleksiAngka[j] > koleksiAngka[j + 1]) {
                        // Proses Tukar Posisi (Swap)
                        int temp = koleksiAngka[j];
                        koleksiAngka[j] = koleksiAngka[j + 1];
                        koleksiAngka[j + 1] = temp;
                }
            }
        }
        
        System.out.println("\n--- Laporan Analisis Data ---");
            System.out.println("Angka Tertinggi : " + palingBesar);
            System.out.println("Angka Terendah  : " + palingKecil);
            
            System.out.print("Urutan Data     : \"");
            for (int angka : koleksiAngka) {
                System.out.print(angka + " ");
                }
            System.out.println();
            
            scan.close();
        }
    }
}    