package Utilities;

public class StringUtility {



    public static String reverse(String str) {
        String reverse = " ";
        for (int i = str.length() - 1; i >= 0; i--) {  // i: index number of the given string starting for last index to index 0
            reverse += str.charAt(i);    // to get each character of the string starting from last index to index zero
        }

        return reverse;
    }

}
