package MainMobil;
public class Mobil {
    private String noPlat;
    private String warna;
    private String merk;
    private int kecepatan;


    public void setNoPlat (String s) {
        noPlat = s ;
    }

    public void setWarna (String s) {
        warna = s ;
    }

    public void setMerk (String s) {
        merk = s ;
    }

    public void setKecepatan (int i) {
        kecepatan = i ;
    }

    public void displayMessage() {
        System.out.println("Mobil anda adalah bermerek " + merk);
        System.out.println("Mobil anda adalah bermerek " + noPlat);
        System.out.println("Mobil anda adalah bermerek " + warna);
        System.out.println("Mobil anda adalah bermerek " + kecepatan);

    }

}

