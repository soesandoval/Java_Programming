package Day11_StringPart2;
import java.util.Scanner;
public class DigitLetterSpecialChar {
    public static void main(String [] args){

        String str = new Scanner(System.in).nextLine();

        if(str.length()>=1){ // if the string has at least one character

            char f = str.charAt(0);// the first character of a string

            if(f>= 48 && f<= 57){
                System.out.println("first character is digit ");
            }else if(f>= 'A' && f<= 'Z'){
                System.out.println("first character is uppercase letter");
            } else if( f>= 'a' && f<= 'z') {
                System.out.println("first character is lowercase letter");
            } else {
                System.out.println("first character is special character");
            }

        }else {
            System.out.println("String is empty");
        }


    }
}
