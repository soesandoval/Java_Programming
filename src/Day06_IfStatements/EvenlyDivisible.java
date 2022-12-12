package Day06_IfStatements;

public class EvenlyDivisible {
    public static void main(String[] args) {

        int number = 65;

        boolean IsDivisible2 = number % 2 == 0;
        boolean IsDivisible3= number % 3 == 0;
        boolean IsDivisible5= number % 5 == 0;

        System.out.println(number + " is evenly divisible by 2 : "+ IsDivisible2);
        System.out.println(number + " is evenly divisible by 3 : " + IsDivisible3);
        System.out.println(number + " is evenly divisible by 5 : "+ IsDivisible5);

    }
}
