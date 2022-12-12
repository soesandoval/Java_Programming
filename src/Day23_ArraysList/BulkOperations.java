package Day23_ArraysList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> numbers =  new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);


        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list1.addAll(1, numbers);

        System.out.println(list1);

        System.out.println("=============================");


        ArrayList <Integer> scores = new ArrayList<>();

        // NEEDS TO BE A COLLECTION TYPE scores.addAll(75,85,95,80,70);

        scores.addAll(Arrays.asList(75,85,95,70,80));

        System.out.println(scores);

        System.out.println("============================");

        ArrayList<String > students = new ArrayList<>();

        students.addAll(Arrays.asList("Sofia","Lorenso","Muhtar","Karen"));

        System.out.println(students);

        students.addAll(2,Arrays.asList("Josue","Joseph","Julissa"));

        System.out.println(students);

        System.out.println("======================================");

        Integer [] ums ={1,2,3,4,5,6,7,8,9};

        ArrayList<Integer> L1 = new ArrayList<>();
        L1.addAll(Arrays.asList(ums));

        System.out.println(L1);

        System.out.println("======================================");

        ArrayList<String> employeesList = new ArrayList<>();
        employeesList.addAll(Arrays.asList("Alena","Muhtar","Gadir","Ali"));

        System.out.println(employeesList);

        boolean hasAlena = employeesList.contains("Alena");

        boolean hasAlenaGadir = employeesList.containsAll( Arrays.asList("Alena", "Gadir") );

        boolean hasMuhtarAliKuzzat = employeesList.containsAll( Arrays.asList("Muhtar", "Ali", "Kuzzat") );

        System.out.println("hasAlena = " + hasAlena);
        System.out.println("hasAlenaGadir = " + hasAlenaGadir);
        System.out.println("hasMuhtarAliKuzzat = " + hasMuhtarAliKuzzat);

        System.out.println("========================================");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,10,20,30,40,50,60,70,80,90,10,10,20,20));

        list.removeAll(Arrays.asList(20,10));

        System.out.println(list);




    }
}
