package pkgabstract.pkgclass;

public class AbstractClass {
    public static void main(String[] args) {
        MobilePhone HP1 = new MobilePhone();
        SmartPhone HP2 = new SmartPhone("081255556666");
        HP1.setPhoneNumber("081233334444");
        HP1.setMerk("Samsung");
        HP2.setMerk("XIAOMI");
        System.out.println("===================");
        HP1.call("081255557777");
        HP1.displayInfo();
        HP1.call("081233334444");
        System.out.println("===================");
        HP2.endCall();
        HP2.displayInfo();
        checkPhoneNumber(HP1);
        checkPhoneNumber(HP2);

    }
    
    
    public static void checkPhoneNumber(Phone phone) {
        System.out.println("Nomor dari telpon ini adalah : " +
        phone.getPhoneNumber());
    }

}
