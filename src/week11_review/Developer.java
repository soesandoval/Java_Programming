package week11_review;

public class Developer extends Employee{
    public Developer(String name, int age, char gender, String jobTitle, String employeeID, double salary) {
        super(name, age, gender, jobTitle, employeeID, salary);
    }

    public void unitTesting(){
        System.out.println(getName() + " is coding ");
    }



}
