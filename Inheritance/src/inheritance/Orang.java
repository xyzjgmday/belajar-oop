package inheritance;
public class Orang {
    String nama;
    String alamat;
    
    public void tampilData(){
        System.out.println("Nama orang : "+nama);
        System.out.println("Nama alamat : "+alamat);
      }
    
    public void setNama (String n){
        nama = n;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setAlamat (String a){
        alamat = a;
    }
    
    public String getAlamat(){
        return alamat;
    }
}
