package Day21_MultidimensionalArray;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "heart";
        String str2 = "earth";

        //String [] a1 = str1.split("  ");
       // String [] a2 = str2.split("  ");

        //OR

        char [] a1 = str1.toCharArray();
         char [] a2 = str2.toCharArray();


        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.toString(a1));

        Arrays.sort(a1);
        Arrays.sort(a2);

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

        boolean isAnagram = Arrays.equals(a1,a2);

        System.out.println("Is an anagram= " + isAnagram);






    }
}
