package Day05_Operators;

public class RelationalOperators {
    public static void main(String [] args) {
        int a = 200;
        int b = 1000;

        System.out.println( a > b);
        boolean aIsGreater = a > b;
        System.out.println(aIsGreater);

        System.out.println("---------------------------------------");

        int age = 21;

        boolean eligibleToBuyAlcohol = age >= 21;

        System.out.println(eligibleToBuyAlcohol);

        boolean eligibleToVote = age >= 18;

        System.out.println(eligibleToVote);

        System.out.println("----------------------------------------------------");

        System.out.println( 100 > 100); // false
        System.out.println(100 >= 100);//true
        System.out.println(100>= 185);// false

        int score = 48;

        boolean failed = score < 60;

        System.out.println(failed);// true

        System.out.println( 95 <= 100); // true
        System.out.println( 10 <= 5); // false

        System.out.println("----------------------------------");










    }
}
