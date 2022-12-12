package Day24_ArraysList_DateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityMethods {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java","Java","C#","Ruby","Swift","Swift","Java","C++","C#"));

        System.out.println(names);

        for (int i = 0; i <names.size() ; i++) {
            if (names.get(i).equals("Java"));
            names.set(i,"Python");

        }

        System.out.println(names);

        //===================OR==========================

        Collections.replaceAll(names,"Java","Python");

        System.out.println("Names: " + names);

        System.out.println("====================================");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,20,10,30,40,50,50,50,50,50,60,70,50));

        int frequencyOf50= Collections.frequency(list, 50);

        System.out.println("Frequency of 50 = " +  frequencyOf50);

        ArrayList<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList("Java","Java","C#","Ruby","Swift","Swift","Java","C++","C#"));

        int CountOfJava = Collections.frequency(names2, "Java");

        System.out.println("Count of Java = " + CountOfJava);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(10,20,10,30,40,50,50,50,50,50,60,70,50));

        for (Integer each : list2) {
            if(Collections.frequency(list2, each ) == 1){ // if  each number's frequency of list2 equals 1 then print out that number's frequency
                System.out.println(each);
            }

        }


}}
