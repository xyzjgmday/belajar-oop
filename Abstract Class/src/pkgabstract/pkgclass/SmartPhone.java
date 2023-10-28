package pkgabstract.pkgclass;

/**
 *
 * @author Day
 */
public class SmartPhone extends Phone {
    private String ipAddress;
    public SmartPhone(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void call(String callNumber) {
        System.out.println("Smartphone ini sedang memanggil nomor " + callNumber);
    }

    public void endCall() {
        System.out.println("Panggilan telah selesai dilakukan.");
    }
    
    public void displayInfo() {
        System.out.println("Merk: " + getMerk());
        System.out.println("Nomor Telepon: " + getIpAddress());
    }
}
