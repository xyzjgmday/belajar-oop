/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package persegipanjang;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Day
 */
public class PersegiPanjang {
     public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Minta pengguna memasukkan panjang
            System.out.print("Masukkan panjang persegi panjang: ");
            String panjangStr = br.readLine();
            double panjang = Double.parseDouble(panjangStr);

            // Minta pengguna memasukkan lebar
            System.out.print("Masukkan lebar persegi panjang: ");
            String lebarStr = br.readLine();
            double lebar = Double.parseDouble(lebarStr);

            // Hitung luas
            double luas = panjang * lebar;

            // Tampilkan hasil
               System.out.println("Luas persegi panjang adalah: " + luas);
           } catch (IOException e) {
               System.err.println("Terjadi kesalahan saat membaca input.");
           } catch (NumberFormatException e) {
               System.err.println("Input yang dimasukkan tidak valid. Pastikan memasukkan angka.");
           } finally {
               try {
                   br.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
       }
   }