package Day24_ArraysList_DateAndTime;

import Day17_CustomClassMethods.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Employee> employees= new ArrayList<>();
        employees.addAll(Arrays.asList( new Employee(),new Employee(),new Employee(),new Employee(),new Employee()));

        employees.get(0).SetInfo1("Josh",34,'M',"Java developer",100000,"A01");
        employees.get(1).SetInfo1("Emily",40,'F',"SDET",90000,"A02");
        employees.get(2).SetInfo1("Conor",38,'M',"Project manager",130000,"A03");
        employees.get(3).SetInfo1("Bella",29,'F',"Java developer",95000,"A04");
        employees.get(4).SetInfo1("Jimmy",54,'M',"Data Analyst",105000,"A05");

        for (Employee each : employees){
            System.out.println(each.name + " : " + each.jobTitle);
        }

        System.out.println("===========================================");

        for (Employee each : employees) {
            if(each.jobTitle.equals("Java developer")){ // if the job title of the employee is Java developer
                System.out.println(each.name); // then print the name of the employee
            }
        }

        System.out.println("===========================================");

        double max = employees.get(0).salary;
        double min = employees.get(0).salary;


        for (Employee each : employees) {
            if(each.salary> max ) {
                max = each.salary;
            }

            if(each.salary < min){
                min = each.salary;
            }
        }

        System.out.println("Min= " + min);
        System.out.println("Max= " + max);

        System.out.println("===============================");

        ArrayList<Employee> femaleEmployees = new ArrayList<>();
        ArrayList<Employee> maleEmployees = new ArrayList<>();

        for (Employee each : employees) {
            if(each.gender == 'M'){
                maleEmployees.add(each);
            }else {
                femaleEmployees.add(each);
            }

        }

        System.out.println("Total number of female employees: " + femaleEmployees);
        System.out.println("Total number of male employees: " + maleEmployees);










    }
}
