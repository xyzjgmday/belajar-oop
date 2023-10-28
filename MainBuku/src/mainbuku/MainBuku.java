package mainbuku;
public class MainBuku {
    public static void main(String[] args) {
        // Membuat objek buku pertama
        Buku buku1 = new Buku();                           
        buku1.setJudul("Bumi");
        buku1.setPenulis("Tere Liye");

        // Membuat objek buku kedua
        Buku buku2 = new Buku();
        buku2.setJudul("Raden Banyak Sumba");
        buku2.setPenulis("Saini K.M");

        // Menampilkan informasi buku-buku
        System.out.println("Informasi Buku Pertama:");
        System.out.println("Judul: " + buku1.getJudul());
        System.out.println("Penulis: " + buku1.getPenulis());

        System.out.println("\nInformasi Buku Kedua:");
        System.out.println("Judul: " + buku2.getJudul());
        System.out.println("Penulis: " + buku2.getPenulis());
    }
}