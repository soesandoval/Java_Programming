package Day20_ForEach;

import java.util.Arrays;
import Utilities.ArraysUtility;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int array [] = {1,2,3,4};
        int array2 [] ={5,6,7,8};

        int array3 [] = new int[array.length + array2.length]; // to make sure third array has enough capacity

        int k = 0;

        for (int i = 0; i < array.length; i++, k++) {
            array3[k] = array[i];
        }

        for (int i = 0; i < array2.length; i++, k++) {
            array3[k]= array2[i];
        }


        System.out.println(Arrays.toString(array3));

        System.out.println("====================================================");

        int[] arra=  {10,20,30,40,50};
        int [] arra2 = {60,70,80,90};

        int[] arra3 = ArraysUtility.merge(arra, arra2);

        System.out.println(Arrays.toString(arra3));

        System.out.println("==============================");

        double [] b1 = {10.5, 7.5, 6.7};
        double [] b2 = {12.3,14.6, 67.8};

        double[] b3 =ArraysUtility.mergeD(b1, b2);

        System.out.println("-----------------------------------------------------");

        char[] ch1 = {'A', 'B', 'C', 'D'},
                ch2 = {'E', 'F', 'G'};

        char [] ch3 = ArraysUtility.mergeCh(ch1, ch2);




    }
}
