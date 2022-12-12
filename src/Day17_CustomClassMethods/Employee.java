package Day17_CustomClassMethods;

public class Employee {

    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;
    public String ID;

    public Employee() {
    }

    public void SetInfo1(String name, int age, char gender, String jobTitle, double salary, String ID) {
             this.name = name;
             this.age = age;
             this.gender = gender;
             this.jobTitle = jobTitle;
             this.salary = salary;
             this.ID = ID;  // CONTROL + A if you want to select all of them
    } // SETS ALL THE ATTRIBUTES OF THE EMPLOYEE OBJECT


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", ID='" + ID + '\'' +
                '}';
    } // USED TO AVOID GETTING HASH CODE WHEN WE PRINT OBJECTS

    public void work(){
        System.out.println(name +  " is currently working. ");
    }


}


