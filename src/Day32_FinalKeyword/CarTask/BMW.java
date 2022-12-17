package Day32_FinalKeyword.CarTask;

public class BMW extends Car {

    public BMW(String model, String color, int year, double price) {
        super(model, color, year, price);
    }


    @Override
    public void start() {
        System.out.println("Don't work call a mechanic" +getMake() + getModel());
    }
}
