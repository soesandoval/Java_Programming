package Day06_IfStatements;

public class OddOrEven {
    public static void main(String [] args) {
        int number = 20;

        boolean IsEven = number % 2 == 0;
        boolean IsOdd= number % 2 != 0;
        boolean IsOdd2 = !IsEven;

        System.out.println(number + " is an even number: " + IsEven) ;
        System.out.println(number + " is an odd number: " + IsOdd2);





    }
}
