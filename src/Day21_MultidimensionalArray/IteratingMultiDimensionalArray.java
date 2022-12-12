package Day21_MultidimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {

        // index of elements     0, 1, 2,     0, 1, 2, 3,         0, 1, 2
        int [] [] array2d = {{10,20,30}, {40,50,60,70},{80,90,100}};
        // index of 1D Array     0                 1                       2

        for (int i = 0; i < array2d.length; i++) {

             int [] each1D = array2d[i];

            System.out.println(Arrays.toString(each1D));

            for (int j = 0; j < each1D.length; j++ ){ // j: index number of elements in each 1D array of array2D
                int eachElement = each1D[j];

                System.out.println(eachElement);
            }

        }

        System.out.println("=====================OR=================");

        for (int[] each1DArray : array2d) {
            System.out.println(Arrays.toString(each1DArray));

            for (int eachElement : each1DArray) {
                System.out.println(eachElement);

            }

        }


        System.out.println("====================");
         // ALL ELEMENTS PRINT OUT IN REVERSE
        for ( int i = array2d.length -1 ; i  >= 0 ; i --){
            for (int j = array2d.length -1; j >= 0 ; j--) {
                System.out.println(array2d[i][j]);
            }
        }








    }
}
