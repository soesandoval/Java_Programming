package day36_polymorpishm;

import Day29_OOPInheritance.Animal.Animal;
import Day29_OOPInheritance.Animal.Cat;
import Day29_OOPInheritance.Animal.Dog;
import Day30_Inheritance.PhoneTask.Nokia;
import Day30_Inheritance.PhoneTask.PhoneTask;
import day33_abstraction.Developer;
import day33_abstraction.Employee;
import day33_abstraction.Tester;

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


    }


}
