package Day30_Inheritance.PhoneTask;

import Day30_Inheritance.PhoneTask.Samsung;

public class TestPhoneObjects {


    public static void main(String[] args) {

        iPhone iphone = new iPhone("Apple", "iPhone 12", "Large",2000.0, "White");

        Samsung samsung =  new Samsung("Samsung", "Galaxy s22", "Medium",1100.00 , "White");

        Nokia nokia = new Nokia("Nokia", "Brick", "small", 50, "Pink");

        System.out.println("CALLING");

        samsung.call(911);
        iphone.call(911);
        nokia.call(911);

        System.out.println("TEXTING");


        nokia.text(911);
        samsung.text(911);
        iphone.text(911);

        System.out.println("===========================================");

        iphone.facetime("soesandoval9@hotmail.com");
        // samsung. facetime()


        samsung.freeze();
        //nokia.freeze()

        nokia.selfDefense();
        //iPhone.selfDefense





    }


}
