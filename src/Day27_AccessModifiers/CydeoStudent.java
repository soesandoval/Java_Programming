package Day27_AccessModifiers;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;

    public static String schoolName = "Cydeo";
    public static String secretCode;

    public CydeoStudent(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    //    schoolName = "Cydeo School";
     //   secretCode="Wooden Spoon";
    }

    static {
        secretCode = "Wooden Spoon";
       // schoolName= "Cydeo School";
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
