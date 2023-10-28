package majusejahterabersama;
public class Pegawai {
    private String nama;
    private String noPegawai;
    private double gaji;

    public Pegawai(String nama, String noPegawai, double gaji) {
        this.nama = nama;
        this.noPegawai = noPegawai;
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    public String getnoPegawai() {
        return noPegawai;
    }

    public double getGaji() {
        return gaji;
    }

    public double hitungPenghasilanTahunan() {
        return gaji * 12;
    }
}
