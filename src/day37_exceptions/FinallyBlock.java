package day37_exceptions;

public class FinallyBlock {
    public static void main(String[] args) {

        try{

            System.out.println(9/0);

        }catch (RuntimeException e){

            System.out.println("Runtime exception has been caught");
            e.printStackTrace();
            System.exit(1);

        }finally { // optional block, it will be used when you have to run the program regardless of the exceptions
            System.out.println("Finally block");

        }





    }
}
