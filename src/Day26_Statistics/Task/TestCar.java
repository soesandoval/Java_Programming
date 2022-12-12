package Day26_Statistics.Task;

public class TestCar {


    public static void main(String[] args) {


        Car car1 = new Car("BMW");

        System.out.println(car1);


        Car car2 = new Car("BMW", "M4");

        System.out.println(car2);

        Car car3 = new Car("Toyota", "Camry", 2021);

        System.out.println(car3);

        Car car4 = new Car("Toyota","Camry",2022, 20000.50);

        System.out.println(car4);

        Car car5 = new Car("Toyota", "Camry", 2022, 28000.00, "blue");






    }


}

