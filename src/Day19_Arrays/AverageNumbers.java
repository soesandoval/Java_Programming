package Day19_Arrays;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Scanner;

public class AverageNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers would you like to enter? ");
        int total = input.nextInt();

        int [] numbers = new int[total];
        int sum = 0;

        for (int i = 0; i < total; i++) {

            System.out.println("Enter a number: ");
           numbers[i] = input.nextInt(); // assigns user input to index number of array
            sum += numbers[i];
        }

        double average = (double) sum / (double) total;

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println(Arrays.toString(numbers));

        System.out.println("Sum= " + sum);

        System.out.println("Average = " + df.format(average));

    }
}
