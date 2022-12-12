package Day26_Statistics.Task;

public class Employee {

    public String name, jobTitle;
    public char gender;
    public double salary;

    public Employee(String name){
        this.name= name;
    }

    public Employee(String name, char gender){
        this("Sofia");
        this.gender = gender;
    }

    public Employee(String name, char gender, String jobTitle){
        this("Sofia",'F');
        this.jobTitle = jobTitle;
    }

    public Employee(String name, char gender, String jobTitle, double salary){
        this("Sofia", 'F', "Daycare worker");
        this.salary = salary;
    }

    public Employee(String name, String jobTitle){
        this("Sofia");
        this.jobTitle = jobTitle;
    }

    public Employee(String name, String jobTitle, double salary){
        this("Sofia", "Daycare worker");
        this.salary = salary;
    }

}
