package majusejahterabersama;
public class Manajer extends Pegawai {
    public Manajer() {
        super("Nur Hidayat", "D112121057", 30000000);
    }

    public double hitungTunjanganTahunan() {
        return getGaji() * 0.15 * 12; // 15%
    }
}
