package Day20_ForEach;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Cydeo School";
        char [] ch = str.replace(" ", "").toCharArray();

        System.out.println(Arrays.toString(ch));

        System.out.println("================================");

        String str2 = "Today is a great day to learn Java";
        String [] words = str2.split("great");

        System.out.println(Arrays.toString(words));

       String sentence = "I love Java";

       String [] arr = ArraysUtility.reverseS( sentence.split(" ") )  ;

        System.out.println(Arrays.toString(arr)); //[Java, Love, I]

        String reversedSentence = " ";

        for (int i = 0; i < arr.length; i++) {
            reversedSentence += arr[i] + " ";

        }

        System.out.println(reversedSentence);









    }
}
