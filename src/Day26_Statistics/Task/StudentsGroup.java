package Day26_Statistics.Task;


import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup {


    public String groupName;
    public int groupID;
     public ArrayList<Student> students;

    public StudentsGroup(String groupName, int groupID) {
        this.groupName = groupName;
        this.groupID = groupID;
        students = new ArrayList<>();

    }

    public void addStudent(Student student){
        students.add(student);
    }


    public void addStudent(String name, int age, char gender, String ID){
        Student student = new Student(name, age, gender, ID);
        students.add(student);
    }


    public void addStudent(Student [] students){
        this.students.addAll(Arrays.asList(students));
    }

    public void removeStudent(String ID){
        students.removeIf(p -> p.equals(ID));
    }// takes the ID and then removes the student object with the specified ID from arraylist of students

    @Override
    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupID=" + groupID +
                ", students=" + students +
                '}';



    }
}
