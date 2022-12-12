package Day28_OOPEncapsulation.Intro;

public class Employee {

    private String name;
    private double salary;

    private int age;

    private String jobTitle;

    public Employee(String name, double salary, int age, String jobTitle) {
        setName(name);
        setAge(age);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary < 0){
            System.err.println("Salary cannot be negative " +salary);
            System.exit(1);
        }

        this.salary = salary;
    }

    public String getName() {if(name ==  null){
        name = "Unknown" ;
    }

        return name;
    }

    public void setName(String name) {

        if (name.isEmpty() || name.isBlank()){
            System.err.println("Employee name cannot be empty or blank ");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age< 16){
            System.err.println("Invalid age" + age);
            System.exit(1);
        }

        this.age = age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {

        if(jobTitle.isBlank() || jobTitle.isEmpty()){
            System.err.println("Job title of the employee cannot be empty ");
            System.exit(1);
        }

        this.jobTitle = jobTitle;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", salary=" + getSalary()+
                ", age=" + getAge() +
                ", jobTitle='" + getJobTitle()+ '\'' +
                '}';
    }
}
