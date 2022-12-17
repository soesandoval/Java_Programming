package Day31_MethodOveriding.MethodOverriding;

public class TestAnimalObjects {

    public static void main(String[] args) {

        Cat cat = new Cat("Dexter", "Bangle", 'F', 4, "small", "grey");

        Dog dog = new Dog("Max", "Husky", 'M', 3, "Large", "White");

        Lion lion = new Lion("Simba", "African Lion", 'M', 6, "Large", "Yellow", true);

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);

        System.out.println("===========================================");

        cat.eat();
        lion.eat();
        dog.eat();

        cat.sleep();




    }


}
