package luasbid2d;
//  @author Day

public class Segitiga {
    private double alas;
    private double tinggi;

    public Segitiga(double A, double T) {
        alas = A;
        tinggi = T;
    }

    public double luasSegitiga() {
        return 0.5 * alas * tinggi;
    }
    
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga(10, 5);
        double luas1 = segitiga.luasSegitiga();
        System.out.println("Luas segitiga adalah: " + luas1);
    }
}