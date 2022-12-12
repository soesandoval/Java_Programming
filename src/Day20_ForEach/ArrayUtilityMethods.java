package Day20_ForEach;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayUtilityMethods {
    public static void main(String[] args) {

        int [] score = {70,100, 80, 90, 65};

      String result = Arrays.toString(score);

        System.out.println(result);
        System.out.println(Arrays.toString(score));

        System.out.println("===================================");

        int [] a1 ={1,2,3,4,5};
        int [] a2 = {1,2,3,4,5};

        boolean result1 = Arrays.equals(a1,a2);

        System.out.println(result1);

        char [] ch1 = {'A', 'B', 'C'};
        char [] ch2 = {'A','C', 'b'};

        boolean result2= Arrays.equals(ch1,ch2);

        System.out.println(result2);

        String [] s1 = {"A","B", "C"};
        String [] s2 = {"A", "B", "c"};

        System.out.println(Arrays.equals(s1,s2));

        System.out.println("===============================");

        int[] nums = {100,80,90,75,88,99,0,5,4,1000,2000};

        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums)); //sorted in ascending order

        System.out.println("Minimum Number: " + nums[0]);
        System.out.println("Maximum Number: " + nums[10]);

        System.out.println("=================================");

        String [] b1 = {"A","B", "C"};
        String [] b2 = {"A","C","B"};

        Arrays.sort(b1);
        Arrays.sort(b2);

        //SORTS IN ASCENDING ORDER

        System.out.println(Arrays.equals(b1,b2));

        System.out.println("==============================");

        String[] students = {"Sofia", "Lorenso", "Karen","Maria","Esther"};

        System.out.println(Arrays.toString(students));

        Arrays.sort(students); // sorts in alphabetic order

        System.out.println(Arrays.toString(students));

        System.out.println("================================");

        int [] array1 = {10,20,30,40,50,60,70};

        int[] array2 = Arrays.copyOf( array1 , 7);

        System.out.println(Arrays.toString(array2));

        System.out.println("==============================");


        int [] n1= {1,2,3,4,5};
        int [] n2 = {6,7,8,9,10,11,12};

        int [] n3 = Arrays.copyOf(n1, n1.length + n2.length);

        for (int i = 0, j =  n1.length; i < n2.length ; i++, j++) {
            n3[j]=n2[i];
        }

        System.out.println(Arrays.toString(n3));

        System.out.println("================================");

        char [] ch = {'A','B', 'C','D','E','F','G'};

        char [] result10 = Arrays.copyOf(ch, 4);

        System.out.println(Arrays.toString(result10));

        char [] result11 = Arrays.copyOf(ch, 90);

        System.out.println(Arrays.toString(result11));

        char [] resul12 = Arrays.copyOfRange(ch,2,4);

        System.out.println(Arrays.toString(resul12));

        char[]  result13 = Arrays.copyOfRange(ch, 4,7);

        System.out.println(Arrays.toString(result13));




    }
}
