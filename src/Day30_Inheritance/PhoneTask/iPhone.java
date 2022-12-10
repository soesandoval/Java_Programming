package Day30_Inheritance.PhoneTask;

public class iPhone extends PhoneTask {

    public iPhone(String brand, String model, String size, double price, String color) {
        super("Apple ", model, size, price, color);
    }

    public static boolean hasApplePay= true;

    public void facetime(long phoneNumber ){
        System.out.println(getModel() + " is facetiming with " + phoneNumber);

    }

    public void facetime( String email){
        System.out.println(getModel() + " is facetiming with " + email);
    }

}
