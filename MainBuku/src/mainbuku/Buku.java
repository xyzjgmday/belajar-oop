package mainbuku;
public class Buku {
    private String judul;
    private String penulis;

//    public Buku(String judul) {
//        this.judul = judul;
//        this.penulis = "Belum Diketahui";
//    }
//
//    public Buku(String judul, String penulis) {
//        this.judul = judul;
//        this.penulis = penulis;
//    }
    
     public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }
}