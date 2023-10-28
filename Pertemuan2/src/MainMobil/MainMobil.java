package MainMobil;

public class MainMobil {
    public static void main(String[] args) {
//        instan objek m
        Mobil m1 = new Mobil();
        m1.setKecepatan(50);
        m1.setMerk("Toyota");
        m1.setNoPlat("D 1231 UA");
        m1.setWarna("Merah");
        m1.displayMessage();
        System.out.println("===============");
        
//        objek m2
        Mobil m2 = new Mobil();
        m2.setKecepatan(50);
        m2.setMerk("Toyota");
        m2.setNoPlat("D 1231 UA");
        m2.setWarna("Merah");
        m2.displayMessage();
        System.out.println("===============");
        
        //        objek m3
        Mobil m3 = new Mobil();
        m3.setKecepatan(100);
        m3.setMerk("Avanza");
        m3.setNoPlat("D 1572 XGH");
        m3.setWarna("Silver");
        m3.displayMessage();
        System.out.println("===============");
        
        //        objek m4
        Mobil m4 = new Mobil();
        m4.setKecepatan(80);
        m4.setMerk("Expander");
        m4.setNoPlat("D 1612 ABU");
        m4.setWarna("Merah");
        m4.displayMessage();
        System.out.println("===============");
        
        //        objek m5
        Mobil m5 = new Mobil();
        m5.setKecepatan(70);
        m5.setMerk("Inova");
        m5.setNoPlat("D 1789 ASF");
        m5.setWarna("Hitam");
        m5.displayMessage();
        System.out.println("===============");
        
//        rubah warna
        System.out.println("mobil pada objek m1 jadi kuning");
        m1.setWarna("Kuning");
        
        m1.displayMessage();  
        
    }
    
}
