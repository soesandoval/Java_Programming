package Day32_FinalKeyword.CarTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Tesla extends Car{

    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    public void autoPilot(){
        System.out.println(getModel() + getMake() + " is in self-driving mode ");
    }

    @Override
    public void start() {
        System.out.println("Say \"Start\" to start " + getMake() + getModel());
    }

    @Override
    public void setModel(String model) {

       String [] models = {"Model S", "Model Y", "Model X", "Model 3"};

       if (!Arrays.asList(models).contains(model)){
           System.err.println("Invalid Tesla Model" + model);
           System.exit(1);
       }

       super.setModel(model);
    }

    @Override
    public void setColor(String color) {
        ArrayList<String> colors = new ArrayList<>();

        colors.addAll(Arrays.asList("White", "Black", "Brown", "Red", "Silver", "Blue", "Green"));

        if (!colors.contains(color)){
            System.err.println("Invalid Color");
            System.exit(1);
        }

        super.setColor(color);

    }


    @Override
    public void setYear(int year) {

        if(year < 2008){
            System.err.println("Invalid year");
            System.exit(1);
        }

        super.setYear(year);
    }

    @Override
    public void setPrice(double price) {

        if(price < 50000.00){
            System.err.println("Invalid price. Tesla too expensive for you or too cheap...");
            System.exit(1);
        }

        super.setPrice(price);
    }
}
