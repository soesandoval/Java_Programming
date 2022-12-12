package Day22_ArraysList;

import Utilities.ArraysUtility;

public class Test {
    public static void main(String[] args) {

int [] numbers = {10,20,30,40,50,60,70,90};

boolean has25 = ArraysUtility.contains(numbers,25);

        System.out.println("has 25 = " +has25);

        System.out.println("===============================");

        String [] names = {"Sofia", "Esther","Molina","Sandoval"};

        boolean hasSofia = ArraysUtility.contains(names,"Sofia");

        System.out.println("Has Sofia= " +hasSofia);




    }
}
