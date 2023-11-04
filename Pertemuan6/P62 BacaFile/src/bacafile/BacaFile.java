package bacafile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BacaFile {
    public static void main(String[] args) {
        String fileName = "src/Catatanku.txt" ;
        
        try {
            // Membaca file
            File myFile = new File(fileName);
            Scanner fileReader = new Scanner(myFile);
            
            // Mencetak isi file
            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                System.out.println(data);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
