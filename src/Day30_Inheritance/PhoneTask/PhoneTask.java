package Day30_Inheritance.PhoneTask;

import java.util.Arrays;

public class PhoneTask {

    private String brand, model, size;
    private double price;
    private String color;


    public PhoneTask(String brand, String model, String size, double price, String color) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setColor( color);
        setPrice(price);


    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0){
            System.err.println("Invalid price:" + price);
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void call(long phoneNumber){
        System.out.println(getModel() + "  is calling " + phoneNumber);
    }


    public void text(long phoneNumber){
        System.out.println(getModel() + "  is texting " + phoneNumber);
    }



    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }





}
