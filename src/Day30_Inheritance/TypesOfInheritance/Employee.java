package Day30_Inheritance.TypesOfInheritance;

import java.time.LocalDateTime;

public class Employee extends Person {


    private String jobTitle;
    private String employeeID;
    private double salary;


    public Employee(String name, int age, char gender, String jobTitle, String employeeID, double salary) {
        super(name, age, gender );
        setJobTitle(jobTitle);
        setEmployeeID(employeeID);
        setSalary(salary);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName() + " is working ");
    }



}
