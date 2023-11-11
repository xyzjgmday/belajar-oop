/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q1_nurhidayat;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q1_Nurhidayat {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=======================================================");
        System.out.println("= SELAMAT DATANG DI MINI MARKET SEJAHTERA BERSAMA =");
        System.out.println("=          SELAMAT BELANJA SECARA MANDIRI         =");
        System.out.println("=======================================================");


        char jawaban;
        do {
            System.out.print("\nKetikkan nama barang yang anda beli: ");
            String namaBarang = scanner.next();

            System.out.print("Ketikkan jumlah barang yang anda beli: ");
            int jumlah = scanner.nextInt();

            System.out.print("Ketikkan harga barang yang anda beli: ");
            double hargaSatuan = scanner.nextDouble();

            Transaksi transaksi = new Transaksi(namaBarang, jumlah, hargaSatuan);
            transaksi.tampilkanData();
            transaksi.simpanTransaksiKeFile();

            System.out.print("\nApakah mau transaksi lagi? [Y/N]: ");
            jawaban = scanner.next().charAt(0);
        } while (jawaban == 'Y' || jawaban == 'y');

        scanner.close();
    }
}