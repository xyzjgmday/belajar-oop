package luasbid2d;
public class Lingkaran {
    private double jariJari;

    public Lingkaran(double J) {
        jariJari = J;
    }

    public double luasLingkaran() {
        return Math.PI * jariJari * jariJari;
    }
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(2.5);
        double luas2 = lingkaran.luasLingkaran();
        System.out.println("Luas lingkaran adalah: " + luas2);
    }
    
}
