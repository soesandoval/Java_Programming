package Day22_ArraysList;

import java.util.Arrays;
import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {

        int [] array = new int[5];// size is fixed

        array[0] = 20;
        array[1]= 10;
        array[2] =30;
        array[3]=40;
        array[4]=50;

        System.out.println(Arrays.toString(array));

        System.out.println("==================================");

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(list);
        System.out.println(list.size());





    }
}
