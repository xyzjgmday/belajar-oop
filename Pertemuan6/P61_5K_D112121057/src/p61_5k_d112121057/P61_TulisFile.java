package p61_5k_d112121057;
import java.io.FileWriter;
import java.io.IOException;

public class P61_TulisFile {
    public static void main(String[] args) {
        String nama = "Nurhidayat";

        // Menuliskan nama ke dalam file
        try {
            FileWriter fileWriter = new FileWriter("Nurhidayat.txt");
            fileWriter.write(nama);
            fileWriter.close();
            System.out.println("Nama telah ditulis ke dalam file Nurhidayat.txt");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis file: " + e.getMessage());
        }
    }
}
