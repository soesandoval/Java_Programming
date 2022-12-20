package day34_abstraction;

public class Audi extends Car{

    public Audi(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    protected void start() {
        System.out.println("Pres the start button to start " + getMake() + " " + getModel());
    }

    

}
