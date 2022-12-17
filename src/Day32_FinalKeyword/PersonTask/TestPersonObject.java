package Day32_FinalKeyword.PersonTask;

import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[] args) {


        Person person = new Person("Daniel", 'M', LocalDate.of(1991,1, 25));

        System.out.println(person);

        System.out.println("======================");

        Employee employee = new Employee("Emily", 'F', LocalDate.of(1990,4, 2), "Accountant", 100000.00);

        System.out.println(employee);

        System.out.println("=======================");

        person.breathe();
        employee.breathe();


    }


}
