package week11_review;

public class Teacher extends Employee {


    public Teacher(String name, int age, char gender, String jobTitle, String employeeID, double salary) {
        super(name, age, gender, jobTitle, employeeID, salary);
    }


    public void work() {
        super.work( getName() + " is teaching ");
    }


}
