package Day16_NestedLoops;

import java.util.Scanner;

public class LoopPractice {
    public static void main(String[] args) {


        for (int i = 1; i < 6; i++) {

            System.out.println("Hello" + i);

        }

        System.out.println("================================");

        int j =0;
        while (j < 5){
            System.out.println("Hello" + j);
            j++;
        }

        System.out.println("==================================");

        int k =0;
        do{
            System.out.println("Hello" + k);
            k++;
        }while( k < 5);

        System.out.println("=================================");

        // THIS IS A WAY TO REPEAT THE LOOP TILL A VALID VALUE IS ENTERED

        Scanner input= new Scanner(System.in);

        System.out.println("Enter your score:   ");
        int score = input.nextInt();

        while (score > 100 || score< 0){
            System.err.println("Invalid score. Re-enter your score.");
            score = input.nextInt();
        }

        if (score >= 60){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }


    }
}
