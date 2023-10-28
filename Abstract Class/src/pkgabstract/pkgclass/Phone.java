package pkgabstract.pkgclass;
abstract class Phone 
{
    protected String phoneNumber;
    protected String Merk;
    
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setMerk(String Merk) {
        this.Merk = Merk;
    }

    public String getMerk() {
        return Merk;
    }
    
    abstract void call(String callNumber);
    abstract void endCall();
}
