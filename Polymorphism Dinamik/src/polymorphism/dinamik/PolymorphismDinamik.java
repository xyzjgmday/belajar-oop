package polymorphism.dinamik;
public class PolymorphismDinamik {
    public static void main(String[] args) {
        // Membuat objek hewan-hewan
        Hewan hewan = new Hewan();
        Hewan kuda = new Kuda();
        Hewan kucing = new Kucing();
        Hewan ayam = new Ayam();
        Hewan harimau = new Harimau();
        hewan.suara();
        kucing.suara();
        ayam.suara();
        harimau.suara();
        
        

//        // Menampilkan suara dari berbagai hewan
//        tampilkanSuara("Hewan bersuara", hewan);
//        tampilkanSuara("Kuda mengikik ...", kuda);
//        tampilkanSuara("Kucing mengeong ...", kucing);
//        tampilkanSuara("Ayam berkokok ...", ayam);
//        tampilkanSuara("Harimau mengaum ...", harimau);
    }

//    public static void tampilkanSuara(String pesan, Hewan hewan) {
//        System.out.println(pesan);
//        
//        System.out.println();
//    }
}

