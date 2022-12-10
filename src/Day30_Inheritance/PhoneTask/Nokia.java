package Day30_Inheritance.PhoneTask;

public class Nokia extends PhoneTask {


    public Nokia(String brand, String model, String size, double price, String color) {
        super(brand, model, size, price, color);
    }

    public void selfDefense(){
        System.out.println(getBrand() + " " + getModel() + "   can be used for self defense   ");
    }





}
