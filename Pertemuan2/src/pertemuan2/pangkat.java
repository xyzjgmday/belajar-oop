package pertemuan2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pangkat {
     public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      try {
        // Minta pengguna memasukkan bilangan X
            System.out.print("Masukkan bilangan X: ");
            String xStr = br.readLine();
            int x = Integer.parseInt(xStr);

            // Minta pengguna memasukkan bilangan Y
            System.out.print("Masukkan bilangan Y: ");
            String yStr = br.readLine();
            int y = Integer.parseInt(yStr);

            // Inisialisasi hasil Z dengan 1
            int z = 1;

            // Hitung pangkat
            for (int i = 0; i < y; i++) {
                z *= x;
            }
            
            // Tampilkan hasil
            System.out.println(x + " pangkat " + y + " adalah " + z);
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
