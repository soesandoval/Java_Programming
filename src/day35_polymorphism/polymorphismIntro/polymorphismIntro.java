package day35_polymorphism.polymorphismIntro;

import Day30_Inheritance.TypesOfInheritance.Teacher;
import Day31_MethodOveriding.ShapeTask.Circle;

import day33_abstraction.Developer;
import day33_abstraction.Employee;
import day33_abstraction.Tester;
import day34_abstraction.CarTask.Audi;
import day34_abstraction.CarTask.Honda;
import day34_abstraction.CarTask.Tesla;
import day34_abstraction.animalTask.*;

import java.util.Arrays;

public class polymorphismIntro {

    public static void main(String[] args) {


        Dog dog = new Dog("Max", "Husky", 'M', 4, "Small", "White");

        Cat cat = new Cat("Max", "IDK", 'F', 8, "small", "black and white");

        Eagle eagle = null;

        Parrot parrot = null;

        Shark shark = null;


        Animal[] animals = {dog, cat, eagle, parrot, shark};


        Animal animal = new Dog("Max", "Husky", 'M', 5, "small" , "white");


        animal.eat();
        animal.sleep();
        animal.drink();

        // animal.bark();
        // animal.play();

        System.out.println("===========================================");

        String str = " Java ";

        Integer n = 100;

        Double d = 10.0;

        Circle circle = new Circle("circle", 5);

        Honda honda = new Honda("Pilot", "Black", 2019, 35000);

        Audi audi = new Audi("Q6", "bLUE", 2022, 120000);

        Tesla tesla = new Tesla("Model Y", "white", 2020, 200000);

        Object[] objects = {str, n, d, circle, honda, audi, tesla};

        System.out.println(Arrays.toString(objects));

        Teacher teacher = new Teacher("James", 45,  'M', "B1", "Math Teacher", 75000);

        Developer developer = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");

        Tester tester = new Tester("Emily", 35, 'F', "E1", "Manual Tester", 80000);



        Object[] employees = {teacher, developer, tester};


        Employee obj = new Developer("Aaron", 48, 'M', "D1", "Truck Driver" ,90000, "Java");
        obj.work();

        System.out.println("==============================================================");



    }

}
