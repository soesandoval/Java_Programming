package day38_exceptionHandlings;

public class ThrowsKeyword {


    public static void main(String[] args) throws InterruptedException { // throws keyword only handles checked exceptions

        System.out.println("Program1 started");


        Thread.sleep(5000);

        System.out.println("Program1 ended");

        System.out.println("====================================================");


        System.out.println("Program2 started");

            Thread.sleep(5000);

        System.out.println("Program2 ended");







    }


}
