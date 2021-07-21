public class CashRegister {
    private int unit;
    private double price;
    private MemberCard memberCard;
    private double totalPrice;
    private double paid;
    private double change;

    public CashRegister() {
        this.unit = 0;
        this.price = 0;
        this.memberCard = new MemberCard("ไม่มีบัตรสมาชิก", "null", 0);
        this.totalPrice = 0;
        this.paid = 0;
        this.change = 0;
    }

    public void setMemberCard(MemberCard memberCard) {
        this.memberCard = memberCard;
    }

    public void purchaseItem(double purchase) {
        this.unit += 1;
        this.totalPrice += purchase;
    }

    public void pay(double cash, int stamp) {
        if (this.memberCard.getName()== "ไม่มีบัตรสมาชิก") {
            double discount = stamp;
            this.totalPrice -= discount;

            System.out.println("ยอดชำระสินค้าที่ลูกค้าต้องจ่ายจริง :" + this.totalPrice);
            System.out.println("เงินทอน :" + (cash - this.totalPrice));
        } else {
            if (this.memberCard.useStamp(stamp)) {
                double discount = stamp * 2;
                this.totalPrice -= discount;
                System.out.println("ยอดชำระสินค้าที่ลูกค้าต้องจ่ายจริง :" + this.totalPrice);
                System.out.println("เงินทอน :" + (cash - totalPrice));
            } else {
                System.out.println("ยอดชำระสินค้าที่ลูกค้าต้องจ่ายจริง :" + this.totalPrice);
                System.out.println("เงินทอน :" + (cash - totalPrice));
            }
        }
    }
    public void clear(){
        this.unit = 0;
        this.price = 0;
        this.memberCard = new MemberCard("ไม่มีบัตรสมาชิก", "null", 0);
        this.totalPrice = 0;
        this.paid = 0;
        this.change = 0;
    }

    public int getUnit() {
        return unit;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}