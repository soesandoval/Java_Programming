package day38_exceptionHandlings;

public class Person {

    private String name;
    private int age;
    private final char gender;


    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        if(!(gender == 'M'  || gender  == 'F')){
            throw new IllegalArgumentException("Invalid gender, please specify between F or M");
        }
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        if(age ==0){ // if the given age is invalid, then throw runtime exception with exception message and then carsh the program
            throw new RuntimeException("Age has not been set");
        }

        return age;
    }

    public void setAge(int age) {

        if (age<0 || age > 150){
            throw new IllegalArgumentException("Invalid age" + age);
        }


        this.age = age;
    }

    public char getGender() {
        return gender;
    }
}
