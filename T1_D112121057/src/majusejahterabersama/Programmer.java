package majusejahterabersama;
public class Programmer extends Pegawai {
    public Programmer(String nama, String noPegawai, double gaji) {
        super(nama, noPegawai, gaji);
    }

    public double hitungBonusTahunan() {
        return getGaji() * 0.25 * 12; // Bonus 25%
    }
}
