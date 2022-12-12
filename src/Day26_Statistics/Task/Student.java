package Day26_Statistics.Task;

public class Student {

    public String name;
    public int age;
    public char gender;
    public String ID;

    public Student(String name, int age, char gender, String ID) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ID = ID;
    }

    public void study(){
        System.out.println(this.name + " is studying");


    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", ID='" + ID + '\'' +
                '}';
    }




}
