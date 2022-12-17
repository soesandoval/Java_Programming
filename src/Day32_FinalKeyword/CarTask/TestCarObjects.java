package Day32_FinalKeyword.CarTask;

public class TestCarObjects {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", "Blue", 2020, 25000);

        Honda honda = new Honda("Accord", "Gray", 2019, 24000);

        Audi audi = new Audi("q6", "Silver", 2021, 50000);

        BMW bmw = new BMW("X6", "Black", 2017, 45000);

        Tesla tesla = new Tesla("Model S", "White", 2022, 65000);

        System.out.println(toyota);
        System.out.println(honda);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(tesla);

        System.out.println("=============================================");

        toyota.start();
        honda.start();
        audi.start();
        bmw.start();
        tesla.start();

        System.out.println("=========================================");

        tesla.autoPilot();




    }
}
