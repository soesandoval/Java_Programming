package week11_review;

public class Tester extends Employee {

    public Tester(String name, int age, char gender, String jobTitle, String employeeID, double salary) {
        super(name, age, gender, jobTitle, employeeID, salary);
    }

    public void  smokeTesting () {
        System.out.println(getJobTitle() +  getName() + " is testing ");
    }


    public void work() {
        super.work(getJobTitle() + getName() + " is finding bugs" );
    }
}
