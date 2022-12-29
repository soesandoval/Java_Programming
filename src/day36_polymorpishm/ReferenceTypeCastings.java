package day36_polymorpishm;

import Day29_OOPInheritance.Animal.Animal;
import Day29_OOPInheritance.Animal.Cat;
import Day29_OOPInheritance.Animal.Dog;
import Day30_Inheritance.PhoneTask.Nokia;
import Day30_Inheritance.PhoneTask.PhoneTask;
import day33_abstraction.Developer;
import day33_abstraction.Employee;
import day33_abstraction.Teacher;
import day33_abstraction.Tester;
import day35_polymorphism.transportationTask.AutoPark;
import day35_polymorphism.transportationTask.AutoPilot;
import day35_polymorphism.transportationTask.Electric;
import day35_polymorphism.transportationTask.Tesla;

public class ReferenceTypeCastings {

    public static void main(String[] args) {


       // Dog dog = new Dog();

        //Cat cat = new Dog();

        Animal animal = new Dog(); //implicit casting

        System.out.println("=======================================");

        Animal animal1 = new Dog(); //upcasting , polymorphism

        animal1.setInfo("Max", "Husky", 'M', "Large", 4,  " Black and white");

        animal1.eat();
        animal1.drink();
        animal1.sleep();
        //animal1.bark();

        ((Dog)animal1).bark(); // down-casting, polymorphism

        Dog dog1 =  (Dog)animal1; // down-casting, polymorphism, this reusable because it is cast to the variable
        dog1.bark();


       // compile error because there is no "IS A"  relationship (dog cannot be converted to a cat) ( (Cat)animal1 ).meow();

        System.out.println("==========================================");

        PhoneTask phone = new Nokia("Nokia", "Brick", "small", 200, "Black");

        phone.call(8999999);
        phone.text(2679880);
      //  phone.selfDefense();

        ((Nokia)phone).selfDefense();

        System.out.println("==========================================");

        Employee employee = new Developer("Sofia", 30, 'F', "C1", "Java programmer", 20000, "Java");

        employee.work();

        System.out.println( ((Developer)employee).getProgrammingLanguage());

        // there is no "IS A" relationship with the developer; therefore it cannot be casted....Tester tester = (Tester)Employee;

        System.out.println("==============================================");

        Electric electric = (Electric) new Tesla("Tesla", "Model Y", "Blue", 2020, 55000);
        //UPCASTING done implicitly

        electric.charge();
        ((Tesla)electric).selfDrive(); // down-casting done explicitly
        ((AutoPilot)electric).selfDrive(); // down casting done eplicitly

        System.out.println("=============================================");

        Employee employee1 = new Teacher("James", 45, 'M', "B1", "Math teacher", 50000);

        Employee employee2= new Developer("Lucy", 30, 'F', "C1", "Java developer", 100000, "Java");

        Employee employee3 = new Tester("Sofia", 20, 'F', "D1", "Automation tester", 50000);

        employee1.work();
        employee2.work();
        employee3.work();





    }


}
