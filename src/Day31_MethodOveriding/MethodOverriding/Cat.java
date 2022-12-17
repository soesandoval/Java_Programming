package Day31_MethodOveriding.MethodOverriding;

public class Cat extends Animal{
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eat(){
        System.out.println("Cat" + getName() + " is eating cat food");
    }


    public void sleep() {
        System.out.println("Cat" + getName() + " sleeps twelve hours in a day");
    }

}
