package day33_abstraction;

public class Teacher  extends  Employee {

    public Teacher(String name, int age, char gender, String ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

    public void work(){
        System.out.println( getName() + " is teaching class ");
    }


}
