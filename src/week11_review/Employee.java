package week11_review;

public class Employee extends Person {


    private String jobTitle;
    private String employeeID;
    private double salary;


    public Employee(String name, int age, char gender, String jobTitle, String employeeID, double salary) {
        super(name, age, gender);
        setEmployeeID(employeeID);
        setSalary(salary);
        setEmployeeID(employeeID);
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

        if (employeeID.charAt(0) == 0){
            System.err.println("Employee ID cannot start with 0");
            System.exit(1);
        }


        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        if(salary <0){
            System.err.println("Salary cannot be negative");
            System.exit(1);
        }

        if (salary == 0){
            System.err.println("Salary has to be defined");
        }


        this.salary = salary;
    }


    public void work(String s){
        System.out.println(getName() + " is working ");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{" +
                super.toString() +
                "jobTitle='" + jobTitle + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", salary=" + salary +
                '}';
    }
}




