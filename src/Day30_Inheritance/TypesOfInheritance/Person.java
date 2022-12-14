package Day30_Inheritance.TypesOfInheritance;

import java.time.LocalDate;


public class Person {

    private String name;
    private int age;
    private char gender;




    public Person(String name, int age, char gender ) {
        setName(name);
        setGender(gender);



    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if(age<=0 ){
            System.err.println("Age cannot be negative or Zero");
            System.exit(1);
        }


        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


    public void eat(String food ){
        System.out.println(getName() + " is eating  " + food  );
    }


    public void drink(String drink){
        System.out.println(getName() + " is drinking " + drink  );
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +

                '}';
    }
}
