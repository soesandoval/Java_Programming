package Day15_LoopsContinue;

import java.util.Scanner;

public class EligibleToVoteWhileLoopTask {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in) ;

        System.out.println("Enter your age: ");
        int age = input.nextInt() ; // valid age is 1 ~ 120

        while(! (age>= 2 && age <= 120)) {
            System.err.println("Invalid Entry. Please re-enter your age: ");
            age = input.nextInt();
        }

        System.out.println("Are you a US citizen? yes or no");
        String YesNo= input.next().toLowerCase();

        while( ! (YesNo.equals("yes") || YesNo.equals("no"))){
            System.err.println("Invalid entry! Please re-enter answer");
            System.err.println("Are you a US citizen? yes or no");
            YesNo = input.next().toLowerCase();

        }

        if (age>= 21 && YesNo.equals("yes")){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");
        }

        input.close();



    }
}
