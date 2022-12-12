package Day24_ArraysList_DateAndTime;

import Day17_CustomClassMethods.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElements {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) < 4 ){
                list.remove(i); // remove method should never be used in the loop
                i--;
            }
        }

        System.out.println(list);

        System.out.println("=======================================");

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10));

        list2.removeIf( p -> p < 4);

        System.out.println(list2);

        System.out.println("=====================================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java","Python","C#" ,"Java","Ruby" ,"C++"));

        names.removeIf( p -> p.startsWith("J"));

        System.out.println(names);

        System.out.println("=========================================");


        ArrayList<Employee> employees= new ArrayList<>();
        employees.addAll(Arrays.asList( new Employee(),new Employee(),new Employee(),new Employee(),new Employee()));

        employees.get(0).SetInfo1("Josh",34,'M',"Java developer",100000,"A01");
        employees.get(1).SetInfo1("Emily",40,'F',"SDET",90000,"A02");
        employees.get(2).SetInfo1("Conor",38,'M',"Project manager",130000,"A03");
        employees.get(3).SetInfo1("Bella",29,'F',"Java developer",95000,"A04");
        employees.get(4).SetInfo1("Jimmy",54,'M',"Data Analyst",105000,"A05");


        employees.removeIf(p -> p.salary > 100000);

        for (Employee each : employees) {
            System.out.println(each.name + ": " + each.salary);

        }



    }
}
