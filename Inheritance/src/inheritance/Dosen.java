package inheritance;
public class Dosen extends Orang {
    String NIDN;
    
    public void setNIDN(String nidn){
        this.NIDN = nidn;
    }
    
    public String getNIDN() {
        return NIDN;
    }
    
    public void tampilDosen(){
        System.out.println("Nama Dosen : "+nama);
        System.out.println("Alamat Dosen : "+alamat);
        System.out.println("NIDN : "+NIDN);
    }
}
