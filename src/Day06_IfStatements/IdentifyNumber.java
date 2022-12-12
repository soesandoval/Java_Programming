package Day06_IfStatements;

public class IdentifyNumber {
    public static void main(String [] args) {

        int number = 200;

        boolean IsPositive = number > 0;
        boolean IsNegative=number < 0;
        boolean IsZero= number == 0;
        boolean IsZero1= !IsPositive || !IsNegative;

        System.out.println(number + " is positive number: " + IsPositive);
        System.out.println(number + " is negative number: " + IsNegative);
        System.out.println(number + " is Zero: "+ IsZero);


    }
}
