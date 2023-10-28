package overloading;
public class Overloading {

    public static void main(String[] args) {
        Gambar2D objGambar = new Gambar2D();
        objGambar.mengGambar(10);
        objGambar.mengGambar(10, 5);
        objGambar.mengGambar(10, 5, 20);
        objGambar.mengGambar(10, 20, 30, 40);
        objGambar.mengGambar(10, 20, "trapesium");
    }
    
}
