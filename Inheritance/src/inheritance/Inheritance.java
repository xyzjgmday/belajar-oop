package inheritance;
public class Inheritance {
    public static void main(String[] args) {
        Orang PakGiman = new Orang();
        Dosen PakFaisal = new Dosen();
        Mahasiswa Day = new Mahasiswa();
        
        PakGiman.setNama("Giman");
        PakGiman.setAlamat("Jl. Bangka no 23 Jakarta");
        PakGiman.tampilData();
        System.out.println("==============");
        PakFaisal.nama = "Faisal";
        PakFaisal.alamat ="Jl. kenangan Mantan Bandung";
        PakFaisal.setNIDN("D112121057");
        PakFaisal.tampilDosen();
        Day.setNama("Bagus");
        Day.setAlamat("Jl. Burangrang 101 Tasikmalaya");
        Day.hobi = "Naik gunung";
        Day.noHp = "“0813235676789";
        Day.tampilMahasiswa();
    }
    
}
