package Day30_Inheritance.PhoneTask;

import Day30_Inheritance.PhoneTask.PhoneTask;

public class Samsung extends PhoneTask {


    public Samsung(String brand, String model, String size, double price, String color) {
        super(brand, model, size, price, color);
    }


    public void freeze(){
        System.out.println(getBrand() + " " + getBrand() + " freezes a lot ");
    }











}
