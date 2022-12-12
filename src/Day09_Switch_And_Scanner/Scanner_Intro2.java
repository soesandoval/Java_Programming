package Day09_Switch_And_Scanner;
import java.util.Scanner;
public class Scanner_Intro2 {
    public static void main(String[] args){

        Scanner input= new Scanner(System.in);

        System.out.println("Enter your first decimal number");
        float num1= input.nextFloat();

        System.out.println("Enter your second decimal number");
        double num2= input.nextDouble();

        System.out.println("Enter true or false");
        boolean trueOrFalse = input.nextBoolean();

        System.out.println("Number 1= " + num1);
        System.out.println("Number 2= "+ num2);
        System.out.println("True or false = " + trueOrFalse);

        input.close();
    }
}
