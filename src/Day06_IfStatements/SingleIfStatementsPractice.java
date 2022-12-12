package Day06_IfStatements;

public class SingleIfStatementsPractice {
    public static void main(String[] args) {

        int number = 100;

        boolean IsEven= number%2 == 0;
        boolean IsOdd= !IsEven;

        if(IsEven) {
            System.out.println("Even Number");
        }

        if(IsOdd) {
            System.out.println("Odd Number");
        }

        System.out.println("---------------------------------------");

        if(number%2==0) {
            System.out.println("Even Number");
        }
        if(number%2 != 0) {
            System.out.println("Odd Number");
        }


    }
}
