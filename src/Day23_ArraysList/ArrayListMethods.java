package Day23_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {

        int array[] ={1,2,3,4,5};

        array[0] = 100;

        System.out.println(Arrays.toString(array));

        ArrayList<String> groceriesList = new ArrayList<>();

        groceriesList.add("Eggs");
        groceriesList.add("Paper towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking oil");

        System.out.println(groceriesList);

        // groceriesList[2] = "Oranges"         ERROR

        groceriesList.set(2,"Oranges");

        System.out.println(groceriesList);

        groceriesList.add(2, "Chicken");

        System.out.println(groceriesList);

        groceriesList.remove(1);

        System.out.println(groceriesList);

        groceriesList.remove("Paper towels");

        System.out.println(groceriesList);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); // 0
        numbers.add(20); // 1
        numbers.add(30); // 2
        numbers.add(40); // 3
        numbers.add(50); // 4


        boolean r1 = numbers.remove( Integer.valueOf(10) );

        System.out.println(numbers);

        System.out.println(r1);

        numbers.clear();
        System.out.println(numbers);
        System.out.println(numbers.size());


        System.out.println("-------------------------------------------------");

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl"); // 0
        names.add("Vasyl"); // 1
        names.add("Sumeye"); //2
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        System.out.println(  names.indexOf("Vasyl") );
        System.out.println( names.lastIndexOf("Vasyl") );

        System.out.println( names.lastIndexOf("Sumeye") );


        boolean hasMuhtar = names.contains("Muhtar"); // false
        boolean hasAli = names.contains("Ali"); // true

        System.out.println("hasMuhtar = " + hasMuhtar);
        System.out.println("hasAli = " + hasAli);

        System.out.println("===================================");

        ArrayList<String> developers = new ArrayList<>();
        developers.addAll( Arrays.asList(  "Alena", "Muhtar", "Gadir", "Ali", "Khashayar", "Madiyar", "Muhtar", "Muhtar" , "Alena")  );

        developers.retainAll(  Arrays.asList("Alena", "Khashayar", "Muhtar") );

        System.out.println(developers);

        System.out.println("-----------------------------------------");

        ArrayList<String> groceriesList1 = new ArrayList<>();
        groceriesList1.addAll(
                Arrays.asList("Eggs", "Potato",  "Milk", "Tomato", "Rice", "Orange", "Strawberry", "Blueberry", "Paper towels")
        );

        //   groceriesList.retainAll( Arrays.asList("Eggs", "Potato",  "Milk", "Tomato") );
        groceriesList1.removeAll( Arrays.asList("Rice", "Orange", "Strawberry", "Blueberry", "Paper towels") );

        System.out.println(groceriesList1);


        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8};

        ArrayList<Integer> l1 = new ArrayList<>( Arrays.asList(nums) );

        //    l1.addAll(  Arrays.asList(nums) );

        System.out.println(l1);

        System.out.println("-----------------------------------------");

        ArrayList<String> employeesList = new ArrayList<>();
        employeesList.addAll( Arrays.asList(  "Alena", "Muhtar", "Gadir", "Ali" )  );

        System.out.println(employeesList);

        boolean hasAlena = employeesList.contains("Alena");

        boolean hasAlenaGadir = employeesList.containsAll( Arrays.asList("Alena", "Gadir") );

        boolean hasMuhtarAliKuzzat = employeesList.containsAll( Arrays.asList("Muhtar", "Ali", "Kuzzat") );

        System.out.println("hasAlena = " + hasAlena);
        System.out.println("hasAlenaGadir = " + hasAlenaGadir);
        System.out.println("hasMuhtarAliKuzzat = " + hasMuhtarAliKuzzat);

        System.out.println("===================================");

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90,10, 10, 10,20,20));
        list.removeAll(Arrays.asList(10,20));

        System.out.println(list);

        System.out.println("==================================");

        ArrayList<String> developers1 = new ArrayList<>();

        developers1.addAll(Arrays.asList("Alena","Muhtar", "Ali","Gadir","Ali","Madiyar","Muhtar","Muhtar"));

        developers1.retainAll(Arrays.asList("Alena","Ali"));

        System.out.println(developers1);

    }
}
