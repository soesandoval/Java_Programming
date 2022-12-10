package Day30_Inheritance.TypesOfInheritance;

import java.time.LocalDateTime;

public class Student extends Person {

    private char grade;
    private String studentID;

    public Student(String name, int age, char gender, LocalDateTime DOB, char grade, String studentID) {
        super(name, age, gender, DOB);
        setGrade(grade);
        setStudentID(studentID);
    }


    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void study(){
        System.out.println(getName() + " is studying ");

    }





}
