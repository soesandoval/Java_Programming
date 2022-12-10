package week11_review;

public class Janitor extends Employee {
    public Janitor(String name, int age, char gender, String jobTitle, String employeeID, double salary) {
        super(name, age, gender, jobTitle, employeeID, salary);
    }



    public void work() {
        super.work( getName() + " is cleaning ");
    }
}
