package day37_exceptions;

import day35_polymorphism.transportationTask.Car;

public class MultiCatchBlock {

    public static void main(String[] args) {

        System.out.println("Program1 started");

        Car car = null;


        try {
            car.drive();
        }catch (ArithmeticException e){
            System.out.println("First catch block");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("Second catch block");
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("Third catch block");
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            System.out.println("Fourth catch block");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("Fifth catch block");
            e.printStackTrace();
        }


        System.out.println("Program1 ended");

        System.out.println("===================================");

        System.out.println("Program2 started");

        try {

            System.out.println(90 / 0);

        }catch (RuntimeException e){

            e.printStackTrace();

        }

        System.out.println("Program2 ended");


        System.out.println("==============================================");

        System.out.println("Program3 started");

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Program3 ended");

    }


    // try{
    //catch()
 // try multiple times is not allowed only catch


}
