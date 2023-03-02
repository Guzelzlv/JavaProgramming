package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 12", "6.7 inches", 1000, "Black");

        Samsung samsung = new Samsung("galaxy S19", "6 inches", 900, "White");

        Nokia nokia = new Nokia("Brick", "4 inches", 50, "Gray");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(34264823);
        iphone.faceTime(2323223);
        iphone.faceTime("kz_hjh@yxh.org");

        System.out.println("--------------------------------------------------");

        samsung.freeze();
        samsung.call(2232);
        samsung.text(3232);

        System.out.println("--------------------------------------------------");


        nokia.call(23232);
        nokia.text(76667);
        nokia.selfDefense();

        System.out.println( Phone.hasBattery );
        System.out.println(Iphone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);


    }
}
