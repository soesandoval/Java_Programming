package day37_exceptions;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Program started");


        try {

            System.out.println(9 / 0); // Arithmetic exception, unchecked exception means when you guess what kind of exception it is
            System.out.println("Try block");

        } catch (ArithmeticException e){ // if the catch block is not being used properly, it will not catch the exception, you must know what kind of exception it is

            System.out.println("Catch Block");

        }

        System.out.println("Program ended");

        System.out.println("==========================================================");

        System.out.println("Program2 started");

        String str = null;

        try {

            System.out.println(str.toLowerCase());

            System.out.println("Try block");

        }catch (RuntimeException e){ //Runtime, Exception, ot Throwable is a way to identify exceptions without knowing which one it is


            System.out.println("Catch block");

        }

        System.out.println("Program2 ended");

        System.out.println("========================================================");

        System.out.println("Program3 started");

        try {

            Thread.sleep(3000);
            System.out.println("Try block");

        }catch (InterruptedException e){

            System.out.println("Catch block");

        }

        System.out.println("Program3 ended");


    }



}
