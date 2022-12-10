package week11_review;

public class Student extends Person {

    private String studentID, fieldOfStudy, schoolName;
    private char grade;


    public Student(String name, int age, char gender, String studentID, String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender);
        setGrade(grade);
        setStudentID(studentID);
        setSchoolName(schoolName);
        setFieldOfStudy(fieldOfStudy);
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if(! (fieldOfStudy.equalsIgnoreCase("Software engineer in testing"))){
            System.err.println("There is only one field of study");
        }


        this.fieldOfStudy = fieldOfStudy;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }


    public void study() {
        System.out.println(getName() + " is studying ");
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                super.toString() +
                "studentID='" + studentID + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", grade=" + grade +
                '}';
    }
}
