package Day22_ArraysList;

import java.util.ArrayList;

public class IteratingArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(3,255);
        // compile error :   numbers.add(300,2000) // cannot jump indexes

        System.out.println(numbers); // {100,200,300,255.400,500}

        System.out.println("===============================");

        for (int i = 0; i < numbers.size(); i++) { // ITERATING ARRAYLIST
            int each  = numbers.get(i);
            System.out.println(each);
        }

        //===========================OR======================

        for (int i = 0; i < numbers.size(); i++) { // ITERATING ARRAYLIST
            System.out.println( numbers.get(i));
        }

        //================REVERSE ITERATING==============

        for (int i = numbers.size()-1; i >=0 ; i--) {
            System.out.println(numbers.get(i));
        }

        //===================FOR EACH LOOP ================

        for (Integer each : numbers) {
            System.out.println(each);
        }






    }
}
