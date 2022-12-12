package Day17_CustomClassMethods;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.SetInfo1("Karen", 50, 'F', "Java developer", 95000, "A12");

        Employee emp2 = new Employee();
        emp2.SetInfo1("Lorenso", 22, 'M', "Back-end developer",98000, "B13");

        Employee emp3 = new Employee();
        emp3.SetInfo1("Carlos", 25, 'M' , "Front-end developer", 99000, "C14");

        System.out.println(emp);
        System.out.println(emp2);
        System.out.println(emp3);

        emp.work();

    }



}
