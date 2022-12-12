package Day19_Arrays;

import java.util.Arrays;

public class ArraysLiterals {
    public static void main(String[] args) {

        int[] numbers = new int [5]; // new keyboard

        int[] nums = {10,20,30,40,50}; //Arrays literal

        System.out.println(numbers.length);
        System.out.println(nums.length);

        System.out.println("Numbers= " + Arrays.toString(numbers));
        System.out.println("Nums= " + Arrays.toString(nums));

        System.out.println("==================================");

               // element:     1                     2              3                     4                 5          6                  7
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
                // index :        0               1                          2           3                   4             5                 6

        int n = 1;

        System.out.println(days[n-1]);

        System.out.println("===================================");

        String [] months = {"January", "February", "March", "April", "May", "June", "July", "September", "November", "December"};

        System.out.println("Month = " + Arrays.toString(months));

        System.out.println("====================================");

        // int [] numbers2 = new int [100];

        for (int i = months.length - 1; i >= 0; i--) { // REVERSE PRINTING
            System.out.println(months[i]);
        }



    }
}
