package Day25_Constructor;

import java.time.LocalDate;

public class Employee {


    public  String name;
    public int age;
    public char gender;
    public String jobTitle;
    public  double salary;
    public LocalDate hireDate;

    public Employee(String name, int age, char gender, String jobTitle, double salary, LocalDate hireDate) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hireDate = hireDate;
    }// allows us to set all the instance variables of the object as soon as the object is created


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                '}';
    }
}
