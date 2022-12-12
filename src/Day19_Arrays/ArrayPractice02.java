package Day19_Arrays;

import Day05_Operators.ShorthandOperators;

import java.util.Arrays;

public class ArrayPractice02 {

    public static void main(String[] args) {


        int array[] = new int[100];

        for (int i = 0, j = 1; i < array.length ; i++, j++) { // one way to assign 1 ~ 100 values to array values
            array[i] = j;
        }

        for (int i = 0; i < array.length; i++) { //another way to assign 1 ~100 values to array values
            array[i]= i+1;
        }

       // System.out.println("Array = " + array); PRINTS OUT HASHCODE
        System.out.println("Array = " + Arrays.toString(array)); //PROPER WAY

        System.out.println("===========================================");


        int array2[] = new int[100]; //index 0 ~ 99

        for (int i = 0, j = 100; i < array2.length; i++, j--) { // assigns values 1 ~ 100 in reverse
            array2[i]= j;
        }

        for (int i = 0; i < array2.length; i++) {  //assigns values 1 ~ 100 in reverse
            array2[i] = 100 - i;
        }

        System.out.println("Array2 = " + Arrays.toString(array2));


    }
}
