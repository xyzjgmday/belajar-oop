/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q1_nurhidayat;
/**
 *
 * @author Day
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 * @author Day
 */
class Transaksi extends Barang {
    public Transaksi(String namaBarang, int jumlah, double hargaSatuan) {
        super(namaBarang, jumlah, hargaSatuan);
    }

    public void simpanTransaksiKeFile() {
        try {
            FileWriter fileWriter = new FileWriter("Transaksi.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("Anda sudah berbelanja " + namaBarang + " sejumlah " + jumlah + " dengan harga satuan Rp. " + hargaSatuan);
            printWriter.println("Anda mendapatkan diskon " + (diskon * 100) + "%");
            printWriter.println("Harga Total yang harus anda bayar adalah Rp. " + hargaTotal);
            printWriter.println();
            printWriter.close();
            System.out.println("Transaksi berhasil disimpan ke file Transaksi.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
