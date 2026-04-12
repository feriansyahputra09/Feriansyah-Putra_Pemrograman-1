
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Latihan1 - Input dan tampilkan array menggunakan BufferedReader
 * @author [Feriansyah]
 */

public class Latihan1 {
    
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String bacaInput;
        byte jmlData;
        byte[] dataArray;
        
        try {
            System.out.print("Masukkan Jumlah Data: ");
            bacaInput = dataIn.readLine();
            jmlData = Byte.parseByte(bacaInput);
            
            if (jmlData <= 0) {
                System.out.println("Jumlah data harus lebih dari 0!");
                return;
            }
            
            dataArray = new byte[jmlData];
            
            System.out.println();
            for (byte i = 0; i < jmlData; i++) {
                System.out.print("DataArray[" + i + "] = ");
                bacaInput = dataIn.readLine();
                dataArray[i] = Byte.parseByte(bacaInput);                
            }
            
            System.out.println();
            for (byte i = 0; i < jmlData; i++) {
                System.out.println("DataArray[" + i + "] = " + dataArray[i]);
            }
        } catch (IOException e) {
            System.out.println("Ada Kesalahan Membaca Input! ");    
        } catch (NumberFormatException e) {
            System.out.println("Input Harus Berupa Angka! ");
        }               
    }
}
