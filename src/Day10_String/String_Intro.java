package Day10_String;
import java.util.Scanner;
//import java.lang.String;
//import java.lang.System;

public class String_Intro {
    public static void main(String[] args){

        String s1 = "Cat";
        String s2=  "Dog";
        String s3 = "Cat";
        String s4 = "Dog";

        System.out.println(s1==s3);

        System.out.println("---------------------------------------------");

        String str1 = new String("Java");// creates two objects: 1.String pool 2. in heap (outside string)
        String str2 = new String("Java");

        System.out.println(str1==str2);

        System.out.println("-----------------------------------------------");

        String st1= "Python";
        String st2= new String("Python");
                String st3= new String("Python");

        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);

        System.out.println(st1==st2);
        System.out.println(st2==st3);


    }
}
