import java.util.Scanner;

class BelajarJava {
    public static void main(String[] args) {
        
        String nama;
        int umur;
        double ipk;
        String alamat;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("## Biodata Mahasiswa ##");
        System.out.println("======================");
        System.out.println();
        
        System.out.println("Nama : ");
        nama = input.nextLine();
        
        System.out.println("Umur : ");
        umur = input.nextInt();
        
        System.out.println("IPK : ");
        ipk = input.nextDouble();
        input.nextLine();
        
        System.out.println("Alamat : ");
        alamat = input.nextLine();
        
        System.out.println("======================");
        System.out.println();
        
        System.out.print(nama + " berusia "+ umur + " tahun, ");
        System.out.print("memiliki ipk " + ipk);
        System.out.print(" dan beralamat di  " + alamat);
        System.out.println();
        System.out.println("======================");
    }
    
}
