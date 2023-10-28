package pkgabstract.pkgclass;
public class MobilePhone extends Phone {
    public void call(String callNumber) {
        if (callNumber.equals(phoneNumber)) {
            System.out.println("Tidak dapat melakukan panggilan ke nomor sendiri.");
        } else {
            System.out.println("Mobile Phone melakukan panggilan ke : " + callNumber);
        }
    }
    public void endCall() {
        System.out.println("Mobile phone mengakhiri panggilan");
      }
    
    public void displayInfo() {
        System.out.println("Merk: " + getMerk());
        System.out.println("Nomor Telepon: " + getPhoneNumber());
    }
}
