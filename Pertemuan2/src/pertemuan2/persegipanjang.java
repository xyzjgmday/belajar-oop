package pertemuan2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class persegipanjang {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            // Minta pengguna memasukkan panjang
            System.out.print("Masukkan panjang persegi panjang: ");
            String panjangStr = br.readLine();
            int panjang = Integer.parseInt(panjangStr);

            // Minta pengguna memasukkan lebar
            System.out.print("Masukkan lebar persegi panjang: ");
            String lebarStr = br.readLine();
            int lebar = Integer.parseInt(lebarStr);

            // Hitung luas
            int luas = panjang * lebar;

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
