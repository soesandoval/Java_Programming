package Day16_NestedLoops;


import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {


        // THIS PROGRAM ASK USER WHETHER A NUMBER IS ODD OR EVEN AND STATES THE ANSWER
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Enter a number: ");
            int number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println("Even number.");
            } else {
                System.out.println("Odd number.");
            }

            System.out.println("Would you like to enter another number? Yes/No");
            String answer = input.next().toLowerCase();

            while(! (answer.equals("yes") || answer.equals("no"))){
                System.err.println("Invalid entry! Would you like to enter another number? Yes/No");
                answer =input.next().toLowerCase();
            }

            if (answer.equals("no")) {
                break;
            }
        }







    }
}
