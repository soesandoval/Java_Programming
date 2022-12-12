package Day12_CustomMethods;

public class CustomMethodsWithParameter {

    public static void main(String[] args) {

        oddOrEven(600);

        oddOrEven(100009890);


    }

    public static void  oddOrEven(int number) {
        if (number %2 ==0){
            System.out.println(number + " is an even number.");
        }else{
            System.out.println(number + " is an odd number");
        }


    }




}
