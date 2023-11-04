import javax.swing.JOptionPane;

public class CobaJOption {
    public static void main(String[] args) 
    {
        String nama;
        String nim;
        nama = JOptionPane.showInputDialog("Ketik Nama Anda : ");
        nim = JOptionPane.showInputDialog("Ketik Nim Anda : ");
        
        JOptionPane.showMessageDialog(null,"Hallo " + nama + "\n" + "NIM anda adalah " + nim);


    }
    
}
