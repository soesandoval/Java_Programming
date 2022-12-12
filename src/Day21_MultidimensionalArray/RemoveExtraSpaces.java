package Day21_MultidimensionalArray;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveExtraSpaces {
    public static void main(String[] args) {

        String str = "Hello World              I                 Love              Java       ";

        str =str.trim();

        System.out.println(str);

        String [] words = str.split(" ");

        System.out.println(Arrays.toString(words));

        str = "";

        for( String each : words){
            if(!each.isEmpty()){
                str += each+ " ";
            }
        }

        str = str.trim();

        System.out.println(str);


        //=================================

        int array [] = {10,20,50};









    }
}
