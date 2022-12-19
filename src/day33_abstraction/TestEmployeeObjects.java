package day33_abstraction;

public class TestEmployeeObjects {
    public static void main(String[] args) {

    //    Employee employee= new Employee("Sofia", 20, 'M', "A1", "SDET", 85000);
        // We cannot create objects from an abstract class, Object must be created from a concrete class

        Teacher teacher = new Teacher("James", 45, 'M', "B1", "Math teacher", 60000);

        Developer developer = new Developer("Lucy", 30, 'F', "C1", "Java developer", 95000, "Java");

        Driver driver = new Driver("Sofia", 20, 'F', "D1", "Chauffer", 35000);

        Tester tester = new Tester("Karen", 50, 'F', "E1", "Manual tester", 80000);

        System.out.println(teacher);
        System.out.println(developer);
        System.out.println(driver);
        System.out.println(tester);

        System.out.println("=========================================================");

        tester.work();
        teacher.work();
        driver.work();
        developer.work();




    }


}
