package Day30_Inheritance.TypesOfInheritance;

import java.time.LocalDateTime;

public class Teacher extends Employee{


    public Teacher(String name, int age, char gender, String jobTitle, String employeeID, double salary) {
        super(name, age, gender, jobTitle, employeeID, salary);
    }

    public void teach(){
        System.out.println(getName() + " is teaching ");
    }



}
