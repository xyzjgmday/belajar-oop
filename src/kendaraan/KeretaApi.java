package kendaraan;
public class KeretaApi extends Kendaraan {
    private String Jenis;
    private String Nama;
    private int JmlGerbong;
    
    // Metode mutator untuk mengatur Jenis
    public void setJenis(String jenis) {
        this.Jenis = jenis;
    }

    // Metode accessor untuk mendapatkan Jenis
    public String getJenis() {
        return Jenis;
    }

    // Metode mutator untuk mengatur Nama
    public void setNama(String nama) {
        this.Nama = nama;
    }

    // Metode accessor untuk mendapatkan Nama
    public String getNama() {
        return Nama;
    }
    
    // Metode mutator untuk mengatur JmlGerbong
    public void setJmlGerbong(int jmlGerbong) {
        this.JmlGerbong = jmlGerbong;
    }

    // Metode accessor untuk mendapatkan JmlGerbong
    public int getJmlGerbong() {
        return JmlGerbong;
    }
}
