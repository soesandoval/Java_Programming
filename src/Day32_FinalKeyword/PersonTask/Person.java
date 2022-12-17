package Day32_FinalKeyword.PersonTask;

import java.time.LocalDate;

public class Person {

    private String name;
    private final char gender;
    private final int age;
    private final LocalDate dateOfBirth;

    public static final int numberOfHead;

    static{
        numberOfHead=1;
    }

    public Person(String name, char gender, LocalDate dateOfBirth) {
        setName(name);
        if(!(gender =='M' || gender == 'F')){
            System.err.println("Invalid gender");
            System.exit(1);
        }
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.age = LocalDate.now().getYear() - dateOfBirth.getYear();

    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public void drink(){
        System.out.println(name + " is drinking ");
    }

    public final void breathe(){
        System.out.println(name + " is breathing ");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}

