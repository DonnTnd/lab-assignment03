public class MemberCard {
    private String name ;
    private String phoneNumber ;
    private double cumulativePay ;
    private int eStamp ;

    MemberCard(String name, String phoneNumber){
        this(name, phoneNumber, 0) ;
    }

    MemberCard(String name, String phoneNumber,int eStamp){
        this.name = name ;
        this.phoneNumber = phoneNumber ;
        this.eStamp = eStamp ;
        this.cumulativePay = 0 ;
    }

    public void addPurchase(double purchase){
        this.cumulativePay += purchase ;
        purchase = purchase / 50 ;
        this.eStamp += (int)purchase ;
    }

    public boolean useStamp(int stamp){
        if (eStamp >= stamp){
            eStamp -= stamp ;
            return true ;
        }
        else{
            return false ;
        }
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getCumulativePay() {
        return cumulativePay;
    }

    public int geteStamp() {
        return eStamp;
    }
}
