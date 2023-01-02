package day38_exceptionHandlings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword2 {


    public static void main(String[] args) {

         //method1();
        //method2();
    }

    public static void pauseForFiveSeconds() throws InterruptedException {

        Thread.sleep(5000);

    }

    public static void method1() throws InterruptedException{
        System.out.println("Hello world");
        pauseForFiveSeconds();
        System.out.println("Hello cydeo");
    }


    public static void method2() throws InterruptedException, FileNotFoundException {//fastest way to get rid of compile errors from exceptions

        System.out.println("Program1 started");

        Thread.sleep(3000);

        System.out.println("Program2 started");

        new FileInputStream(" ");

        Thread.sleep(5000);


    }




}
