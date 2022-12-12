package Day24_ArraysList_DateAndTime;

import java.time.LocalDate;

public class Person {

    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirth;

    public void setInfo(LocalDate dateOfBirth,String name, char gender) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        age = LocalDate.now().getYear() - dateOfBirth.getYear() ;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
