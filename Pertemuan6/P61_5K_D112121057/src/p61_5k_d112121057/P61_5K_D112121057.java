package p61_5k_d112121057;
import java.util.Scanner;

public class P61_5K_D112121057 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama anda: ");
        String nama = input.nextLine();

        System.out.print("Nama anda ini akan ditulis berapa kali? ");
        int jumlah = input.nextInt();

        for (int i = 1; i <= jumlah; i++) {
            System.out.println(nama);
        }
    }
}
