public class Main {
    public static void main(String[] args) {
        MemberCard john = new MemberCard("John","a") ;
        john.addPurchase(360) ;
        john.addPurchase(486.50) ;
        System.out.println(john.getCumulativePay());
        System.out.println(john.geteStamp());

        MemberCard smith = new MemberCard("Smith"," 0678901234",35) ;
        smith.addPurchase(35) ;
        smith.addPurchase(186) ;
        smith.addPurchase(311) ;
        System.out.println(smith.getCumulativePay());
        System.out.println(smith.geteStamp());

        CashRegister cashRegister = new CashRegister() ;
        cashRegister.purchaseItem(15) ;
        cashRegister.purchaseItem(16.50) ;
        cashRegister.purchaseItem(24) ;
        cashRegister.purchaseItem(18) ;
        cashRegister.purchaseItem(30) ;
        cashRegister.setMemberCard(john) ;
        System.out.println("จำนวนสินค้าทั้งหมดที่ซื้อ :" + cashRegister.getUnit());
        System.out.println("ราคาสินค้ารวม :" + cashRegister.getTotalPrice());
        cashRegister.pay(500,4);

        cashRegister.clear() ;
        System.out.println("=================");
        cashRegister.purchaseItem(34) ;
        cashRegister.purchaseItem(65) ;
        cashRegister.purchaseItem(20) ;
        System.out.println("จำนวนสินค้าทั้งหมดที่ซื้อ :" + cashRegister.getUnit());
        System.out.println("ราคาสินค้ารวม :" + cashRegister.getTotalPrice());
        cashRegister.pay(100,30);
        cashRegister.clear();
    }
}
