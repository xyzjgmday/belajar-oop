package pertemuan2;
import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai mahasiswa: ");
        int nilai = input.nextInt();

        String grade;

        if (nilai >= 85 && nilai <= 100) {
            grade = "A";
        } else if (nilai >= 80 && nilai < 85) {
            grade = "AB";
        } else if (nilai >= 75 && nilai < 80) {
            grade = "B";
        } else if (nilai >= 70 && nilai < 75) {
            grade = "BC";
        } else if (nilai >= 60 && nilai < 70) {
            grade = "C";
        } else if (nilai >= 50 && nilai < 60) {
            grade = "CD";
        } else if (nilai >= 0 && nilai < 50) {
            grade = "D";
        } else {
            grade = "E";
        }

        System.out.println("Nilai mahasiswa Anda: " + grade);
    }
}