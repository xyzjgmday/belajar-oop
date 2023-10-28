package overloading;
public class Gambar2D {
        
    public void mengGambar(int i) {
        System.out.println("Menggambar satu titik : " + i);
    }
    
    public void mengGambar(int i, int j) {
        System.out.println("Menggambar garis degan titik pangkal : " + i + " dan ujung : " + j);
    }
    
    public void mengGambar(int i, int j, int k) {
        System.out.println("Menggambar segitiga dengan titik i = " + i + " j: " + j + " k : " + k );
    }
    
    public void mengGambar(int i, int j, int k, int l) {
        System.out.println("Menggambar segitiga dengan titik i = " + i + " j: " + j + " k : " + k + " l : " + l);
    }
    
    public void mengGambar(int x, int y, String bentuk) {
       System.out.println("Menggambar bentuk " + bentuk + " dengan titik pusat di x=" + x + " dan y=" + y);
    }
}
