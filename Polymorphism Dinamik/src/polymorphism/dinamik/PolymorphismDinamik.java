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
    }
}

