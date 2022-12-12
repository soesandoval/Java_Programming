package Day15_LoopsContinue;
import java.util.Scanner;
public class MaxAndMinNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = -214748364;
        int min= 214748364;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            int num = input.nextInt();

            if (num > max){
                max = num;
            }
            if (num < min){
                min = num;
            }


        }

        System.out.println("Your maximum number is: " + max);
        System.out.println("Your minimum number is: " + min);

    }
}
