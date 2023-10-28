package kendaraan;
public class Mobil extends Kendaraan {
    private String Warna;
    private String Jenis;
    private int JmlPenumpang;

    // Metode mutator untuk mengatur Warna
    public void setWarna(String warna) {
        this.Warna = warna;
    }

    // Metode accessor untuk mendapatkan Warna
    public String getWarna() {
        return Warna;
    }

    // Metode mutator untuk mengatur Jenis
    public void setJenis(String jenis) {
        this.Jenis = jenis;
    }
    
    // Metode accessor untuk mendapatkan Jenis
    public String getJenis() {
        return Jenis;
    }

    // Metode mutator untuk mengatur JmlPenumpang
    public void setJmlPenumpang(int jmlPenumpang) {
        this.JmlPenumpang = jmlPenumpang;
    }

    // Metode accessor untuk mendapatkan JmlPenumpang
    public int getJmlPenumpang() {
        return JmlPenumpang;
    }

}
