package day33_abstraction;

public class Tester extends Employee {

    public Tester(String name, int age, char gender, String ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is testing the application ");
    }
}
