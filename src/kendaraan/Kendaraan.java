package kendaraan;
public class Kendaraan {
    private String JenisMesin;
    private int KapasitasMesin;
    
        // Metode mutator untuk mengatur JenisMesin
    public void setJenisMesin(String jenisMesin) {
        this.JenisMesin = jenisMesin;
    }

    // Metode accessor untuk mendapatkan JenisMesin
    public String getJenisMesin() {
        return JenisMesin;
    }

    // Metode mutator untuk mengatur KapasitasMesin
    public void setKapasitasMesin(int kapasitasMesin) {
        this.KapasitasMesin = kapasitasMesin;
    }

    // Metode accessor untuk mendapatkan KapasitasMesin
    public int getKapasitasMesin() {
        return KapasitasMesin;
    }
       
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
