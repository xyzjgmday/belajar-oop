package pertemuan2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class rollercoaster {
     public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Minta pengguna memasukkan tinggi anak
            System.out.print("Masukkan tinggi anak (dalam cm): ");
            String tinggiStr = br.readLine();
            int tinggiAnak = Integer.parseInt(tinggiStr);

            // Periksa apakah tinggi anak memenuhi syarat
            if (tinggiAnak >= 125) {
                System.out.println("HOREEE!! Bisa naik nihhh");
            } else {
                System.out.println("Yahhh dikit lagi bisa deck");
                System.out.println("Minum susu biar tinggi lah, jangan ngopi mulu");
            }
        } catch (IOException e) {
            System.err.println("ERROR!!!!!");
        } catch (NumberFormatException e) {
            System.err.println("INVALID. ANGKA BUKAN KATA");
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
     }    
}
