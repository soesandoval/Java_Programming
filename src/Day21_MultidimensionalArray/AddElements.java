package Day21_MultidimensionalArray;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5};
        int element = 6;


        int [] newArray = Arrays.copyOf(array, array.length +1);
         newArray[newArray.length-1] = element;


        System.out.println(Arrays.toString(newArray));

        System.out.println("-==================================");

        int[] numbers = {100,90,80,70,60};

        System.out.println(Arrays.toString(numbers));

        numbers = ArraysUtility.addElement(numbers, 50);

        System.out.println(Arrays.toString(numbers));

        System.out.println("==================================");

        String [] names = {"Sofia", "Esther", "Sandoval"};

       names = ArraysUtility.addElement(names, "Molina");
        names = ArraysUtility.addElement(names, "Moln");
        names = ArraysUtility.addElement(names, "Molina");

        System.out.println(Arrays.toString(names));







    }
}
