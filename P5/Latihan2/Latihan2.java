package P5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * Latihan2 - Mengurutkan array dan mencari nilai minimal & maksimal
 * @author [Feriansyah]
 */

public class Latihan2 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String bacaInput;
        byte jmlData;
        byte[] dataArray;
        
        try {
            System.out.print("Jumlah Data : ");
            bacaInput = dataIn.readLine();
            jmlData = Byte.parseByte(bacaInput);
            
            if (jmlData <= 0) {
                System.out.println(" Jumlah Data Harus Lebih Dari 0! ");
                return;
            }
            
            dataArray = new byte[jmlData];
            
            System.out.println();
            for (int i = 0; i < jmlData; i++) {
                System.out.print("DataArray[" + i + "] = ");
                bacaInput = dataIn.readLine();
                dataArray[i] = Byte.parseByte(bacaInput);
            }
            
            Arrays.sort(dataArray);
            
            byte min = dataArray[0];
            byte max = dataArray[jmlData - 1];
            
            System.out.println("\n--- Hasil Pengolahan Data ---");
            System.out.println("Data setelah diurutkan : " + Arrays.toString(dataArray));
            System.out.println("Nilai Minimal          : " + min);
            System.out.println("Nilai Maksimal         : " + max);
            
        } catch (IOException e) {
            System.out.println("Ada Kesalahan Membaca Input! ");
        } catch (NumberFormatException e) {
            System.out.println("Input Harus Berupa Angka! ");   
        } catch (NegativeArraySizeException e) {
            System.out.println("Jumlah Data Tidak Boleh Negatif!");
        }
    }
}    