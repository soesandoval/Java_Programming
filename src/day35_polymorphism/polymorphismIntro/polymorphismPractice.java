package day35_polymorphism.polymorphismIntro;

import Day29_OOPInheritance.Animal.Tiger;
import day34_abstraction.animalTask.*;
import day35_polymorphism.transportationTask.*;

public class polymorphismPractice {

    public static void main(String[] args) {

        Shark shark = new Shark("Fishy", "Myanmars", 'M', 10, "Large", "blue");

        shark.hunt();
        shark.swim();
        shark.eat();
        shark.drink();

        Animal animal = new Eagle("Killer", "American", 'F', 3, "medium", "white and brown");

        animal.eat();
        animal.sleep();
        animal.drink();

        Flyable obj1 = new Eagle("Killer", "American", 'F', 3, "medium", "white and brown");

        obj1.fly();

        System.out.println(obj1.canFly);

        Parrot parrot = new Parrot("Nicky", "south american",  'F', 7, "medium", "multicolor");

        Shark shark1 = new Shark("Fishy", "bahamas", 'M', 8, "small", "black");

        Eagle eagle = new Eagle("Sharp", "north american", 'M', 9, "large", "brown");

        Cat cat = new Cat("Puss", "expensive", 'F', 9, "medium", "grey");

        Dog dog = new Dog("Playful", "husky", 'M', 3, "large", "black and white");

        CydeoCar cydeoCar = new CydeoCar("Cydeo", "car", "blue", 2022, 200000);

        Flyable [] birds= {parrot, eagle};

        Swimmable [] fishes = {shark1, cydeoCar};

        Playable [] friendlyAnimals = {dog,cat};

        boolean isAnimal = dog instanceof Animal;

        System.out.println(isAnimal);

        System.out.println("======================================================");

        Car car = new Tesla("Tesla", "Model S", "black", 2020, 150000 );

        boolean isTesla = car instanceof Tesla;

        boolean isAudi = car instanceof  Audi;

        boolean isElectric = car instanceof Electric;

        boolean hasAutoPark = car instanceof AutoPark;

        System.out.println(" is a tesla =" + isTesla);

        System.out.println(" is an audi =  " + isAudi);

        System.out.println(" is an electric car = " + isElectric);

        System.out.println(" has auto park = " + hasAutoPark);








    }



}
