package Day11_StringPart2;
import Day05_Operators.ShorthandOperators;

import java.util.Scanner;
public class StringMethods1 {
     public static void main(String[] args) {

         String str1 = "CYDEO School";

         str1 = str1.toLowerCase(); // "cydeo school"

         System.out.println(str1);
         System.out.println("-------------------------------------------");

         String str2= "java programming";

         str2 = str2.toUpperCase(); // JAVA PROGRAMMING

         System.out.println(str2);

         System.out.println("---------------------------------------------");

         String word = "Wooden Spoon";

        //  word = word.toUpperCase();

         System.out.println(word);
         System.out.println("----------------------------------------------");

         String str4 = "                                 Cydeo School";

         str4 = str4.trim(); // TRIM EXCLUDES BLANK SPACE

         System.out.println(str4);
         System.out.println("------------------------------------------------");

         String sentence= "Today is Sunday, and we have java class...";

          int index1 = sentence.indexOf('w');

         System.out.println(index1);

         String s1= "I love java programming <3 ....";

         int index2 = s1.indexOf('a');

         System.out.println(index2);

         String s2= "Java Python JavaScript Cydeo Python";

         int a1 = s2.indexOf('a');

         System.out.println(a1);

         int a2 = s2.indexOf("a ");

         System.out.println(a2);

         int a3 = s2.indexOf("Python Ja");

         System.out.println(a3);


         String w = "Java";

         System.out.println(w.indexOf("a")); // 1

         System.out.println(w.lastIndexOf("a")); // 3

         String w2 = "Java Python JavaScript Cydeo Python";

         System.out.println(w2.lastIndexOf('a'));
         System.out.println(w2.lastIndexOf('p'));






    }
}
