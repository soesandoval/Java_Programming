package Day09_Switch_And_Scanner;
import java.util.Scanner; // wild import *

public class Scanner_Intro {
    public static  void  main(String[] args) {

        Scanner input= new Scanner(System.in); // for reading user inputs ...

        System.out.println("Enter your first number: ");
          byte num = input.nextByte();
          System.out.println("Enter your second number");
        short num2 = input.nextShort();
        System.out.println("Enter your third number");
        int num3= input.nextInt();
        System.out.println("Enter your fourth number");
        long num4= input.nextLong();
         input.close(); // SCANNER IS CLOSED , CANNOT READ INPUTS AGAIN

        System.out.println("First number = " + num);
        System.out.println("Second number = " + num2);
        System.out.println("Third number = " + num3);
        System.out.println("Fourth number = " + num4);


    }
}
