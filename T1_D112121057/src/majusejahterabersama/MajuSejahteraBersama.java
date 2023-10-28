package majusejahterabersama;
public class MajuSejahteraBersama {

    public static void main(String[] args) {
        System.out.println("====Gaji Manajer Bulan Desember====");
        Manajer manajer = new Manajer();
        System.out.println("Nama Manajer: " + manajer.getNama());
        System.out.println("No Pegawai Manajer: " + manajer.getnoPegawai());
        System.out.println("Gaji Per Bulan Manajer: Rp. " + manajer.getGaji());
        System.out.println("Tunjangan Tahunan Manajer: Rp. " + manajer.hitungTunjanganTahunan());
        System.out.println("Penghasilan Tahunan Manajer: Rp. " + manajer.hitungPenghasilanTahunan());
        System.out.println();
        
        Programmer programmer = new Programmer("John Promodigu", "123765789", 17500000);
        System.out.println("====Gaji Programmer Bulan Desember====");
        System.out.println("Nama Programmer: " + programmer.getNama());
        System.out.println("No Pegawai Programmer: " + programmer.getnoPegawai());
        System.out.println("Gaji Per Bulan Programmer: Rp. " + programmer.getGaji());
        System.out.println("Bonus Tahunan Programmer: Rp. " + programmer.hitungBonusTahunan());
        System.out.println("Penghasilan Tahunan Programmer: Rp. " + programmer.hitungPenghasilanTahunan());
        
        Pegawai pegawai = new Pegawai("Willy Antokia", "223765789", 15000000);
        System.out.println("====Gaji Pegawai Bulan Desember====");
        System.out.println("Nama Pegawai: " + pegawai.getNama());
        System.out.println("No Pegawai Pegawai: " + pegawai.getnoPegawai());
        System.out.println("Gaji Per Bulan Pegawai: Rp. " + pegawai.getGaji());
        System.out.println("Penghasilan Tahunan Pegawai: Rp. " + pegawai.hitungPenghasilanTahunan());
    }
    
    
    
}
