package Day21_MultidimensionalArray;

import java.util.Arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {


        int [] [] array2D={{1,2}, {3,4,5},};
        int [] [] array2D2={{6,7,8,9},{10,11}, {12,13,14}};
        int [] [] array2D3= {{15,16,17,18}};


        //                                    0,1   0,1,2            0,1,2,3      0,1          0,1,2,           0,1,2,3
        //                                       0     1                   0               1          2                        0
        int [] [] [] array3D = {{{1,2},{3,4,5}}, {{6,7,8,9},{10,11}, {12,13,14}},{ {15,16,17,18}}};
        //     index                                    0                         1                                                      2

        System.out.println(Arrays.deepToString(array3D));

        System.out.println(Arrays.deepToString(array3D[1]));

        System.out.println(Arrays.toString(array3D[0][1]));

        System.out.println(Arrays.toString(array3D[1][0]));

        System.out.println(array3D[1][2][2]);

        System.out.println(array3D[2][0][2]);

        System.out.println("================================");

        for (int i = 0; i < array3D.length; i++) { // i is the index number of two dimensional arrays
            int [][] each2DArray = array3D[i];
            System.out.println(Arrays.deepToString(each2DArray));

            for (int i1 = 0; i1 < each2DArray.length; i1++) { // i1 is the index number of one dimensional array
                int [] each1DArray = each2DArray[i1];
                System.out.println(Arrays.toString(each1DArray));

                for (int i2 = 0; i2 < each1DArray.length; i2++) {
                    int eachElement = each1DArray[i2];
                    System.out.println(eachElement);

                }

            }


        }


    }
}
