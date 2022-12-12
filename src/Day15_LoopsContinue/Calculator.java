package Day15_LoopsContinue;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        double number1 = input.nextDouble();

        System.out.println("Enter your second number: ");
        double number2 = input.nextDouble();

        System.out.println("Enter a math operator");
        char operator = input.next().charAt(0);

        while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
            System.err.println("Invalid operator! Please re-enter the math operator");
            operator = input.next().charAt(0);
        }


        if (operator == '+') {
            System.out.println(number1 + number2);
        } else if (operator == '-') {
            System.out.println(number1 - number2);}
        else if(operator == '*') {
            System.out.println(number1 * number2);
        }else if(operator == '/'){
            System.out.println(number1 / number2);
        }

    }
}
