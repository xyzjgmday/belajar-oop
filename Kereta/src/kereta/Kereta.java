/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kereta;
import java.util.Scanner;

/**
 *
 * @author Day
 */
public class Kereta {
   public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari keyboard
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan tinggi anak
        System.out.print("Masukkan tinggi anak (dalam cm): ");
        int tinggiAnak = input.nextInt();

        // Menentukan apakah anak lolos atau tidak
        if (tinggiAnak >= 125) {
            System.out.println("Hore kamu bisa naik");
        } else {
            System.out.println("Minum susu dulu deck biar bisa naik.");
        }

        // Menutup objek Scanner
        input.close();
    }
}