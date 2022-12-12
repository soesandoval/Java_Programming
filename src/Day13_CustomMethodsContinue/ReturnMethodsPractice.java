package Day13_CustomMethodsContinue;

public class ReturnMethodsPractice {
    public static void main(String[] args) {
        int num = 200;

        if(isEven(num)){
            System.out.println("Your number is even: ");
        }else{
            System.out.println("Your number is odd: ");
        }

    }

    public static boolean isOdd(int num){

        return (num% 2 != 0)? true : false ;

    }

    public static boolean isEven(int num) {

        return  !isOdd(num);

    }

    public static int max(int n1, int n2){

        if(n1>n2){
            return n1;
        }else {
            return n2;
        }

    }



}
