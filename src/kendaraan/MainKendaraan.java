package kendaraan;
public class MainKendaraan {
    public static void main(String[] args) {
        // Membuat objek Kereta Api pertama
        KeretaApi keretaApi1 = new KeretaApi();
        keretaApi1.setNama("Kereta Api Cepat");
        keretaApi1.setJenisMesin("Listrik");
        keretaApi1.setKapasitasMesin(800000);
        keretaApi1.setJmlGerbong(8);

        // Membuat objek Kereta Api kedua
        KeretaApi keretaApi2 = new KeretaApi();
        keretaApi2.setNama("Argo Parahyangan");
        keretaApi2.setJenisMesin("Diesel");
        keretaApi2.setKapasitasMesin(100000);
        keretaApi2.setJmlGerbong(8);

        // Membuat objek Mobil pertama
        Mobil mobil1 = new Mobil();
        mobil1.setJenis("Sedan");
        mobil1.setJenisMesin("Bensin");
        mobil1.setWarna("Merah");
        mobil1.setKapasitasMesin(2000);
        mobil1.setJmlPenumpang(4);

        // Membuat objek Mobil kedua
        Mobil mobil2 = new Mobil();
        mobil2.setJenis("Bus");
        mobil2.setJenisMesin("Diesel");
        mobil2.setWarna("Biru Kuning");
        mobil2.setKapasitasMesin(10000);
        mobil2.setJmlPenumpang(30);

        // Menampilkan data dari keempat objek
        System.out.println("======================");
        System.out.println("Data Kereta Api Pertama:");
        System.out.println("Nama: " + keretaApi1.getNama());
        System.out.println("Jenis Mesin: " + keretaApi1.getJenisMesin());
        System.out.println("Kapasitas Mesin: " + keretaApi1.getKapasitasMesin() + " Watt");
        System.out.println("Jumlah Gerbong: " + keretaApi1.getJmlGerbong());
        System.out.println("======================");

        System.out.println("\nData Kereta Api Kedua:");
        System.out.println("Nama: " + keretaApi2.getNama());
        System.out.println("Jenis Mesin: " + keretaApi2.getJenisMesin());
        System.out.println("Kapasitas Mesin: " + keretaApi2.getKapasitasMesin() + " cc");
        System.out.println("Jumlah Gerbong: " + keretaApi2.getJmlGerbong());
        System.out.println("======================");

        System.out.println("\nData Mobil Pertama:");
        System.out.println("Jenis: " + mobil1.getJenis());
        System.out.println("Jenis Mesin: " + mobil1.getJenisMesin());
        System.out.println("Warna: " + mobil1.getWarna());
        System.out.println("Kapasitas Mesin: " + mobil1.getKapasitasMesin() + " cc");
        System.out.println("Jumlah Penumpang: " + mobil1.getJmlPenumpang());
        System.out.println("======================");


        System.out.println("\nData Mobil Kedua:");
        System.out.println("Jenis: " + mobil2.getJenis());
        System.out.println("Jenis Mesin: " + mobil2.getJenisMesin());
        System.out.println("Warna: " + mobil2.getWarna());
        System.out.println("Kapasitas Mesin: " + mobil2.getKapasitasMesin() + " cc");
        System.out.println("Jumlah Penumpang: " + mobil2.getJmlPenumpang());
        System.out.println("======================");

    }
}

