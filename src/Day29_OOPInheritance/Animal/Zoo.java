package Day29_OOPInheritance.Animal;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();


        dog.setInfo("Max","Husky", 'M', "Large", 4, "White");

        Cat cat = new Cat();

        cat.setInfo("Felicia", "Stray", 'F', "Medium", 5, "Black and white");

        Tiger tiger = new Tiger();

        tiger.setInfo("Shere Khan", "Bengal", 'M', "Large", 5, "Orange");


        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);

        System.out.println("=====================");

        dog.eat();
        dog.sleep();
        dog.drink();

        cat.eat();
        cat.drink();
        cat.sleep();

        tiger.eat();
        tiger.drink();
        tiger.sleep();

        System.out.println("==========================");

        dog.bark();

        cat.meow();
        cat.scratch();

        tiger.hunt();

        System.out.println("================================");











    }


}
