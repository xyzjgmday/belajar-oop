import java.util.Scanner;

public class RollerCoaster {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari keyboard
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan tinggi anak
        System.out.print("Masukkan tinggi anak (dalam cm): ");
        int tinggiAnak = input.nextInt();

        // Menentukan apakah anak lolos atau tidak
        if (tinggiAnak >= 125) {
            System.out.println("Anak dapat menaiki roller coaster!");
        } else {
            System.out.println("Anak tidak dapat menaiki roller coaster.");
        }

        // Menutup objek Scanner
        input.close();
    }
}
