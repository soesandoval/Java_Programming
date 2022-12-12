package Day05_Operators;

public class LogicalOperators {
    public static void  main(String[] args){
        double salary = 60000;
        int creditScore = 650;
        int age = 25;

        boolean eligibleForLoan = salary >= 30000 && creditScore >= 650 && age >= 18;

        System.out.println(eligibleForLoan);

       age = 18;
       String country  = "USA" ;

       boolean eligibleToVote = age >= 18 && country == "USA";

        System.out.println(eligibleToVote); // TRUE

        System.out.println("----------------------------------");

        String answer = "Yes" ;
        boolean ValidAnswer = answer == "yes " || answer == "no" ;
        System.out.println(ValidAnswer);

        System.out.println("--------------------------------------");

        char grade = 'B' ;

        boolean passedTheExam = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' ;
         // && = both ;   || = either .... ! = always false

        System.out.println("--------------------------------------");

        String a = "yes" ;

        boolean yes = a == "yes" ; // true
        boolean no = !yes; // false

        System.out.println("Yes =" + yes);
        System.out.println("no =" + no);

        System.out.println("--------------------------");
          int score = 65;

          boolean passed = score  >= 60;
          boolean failed= !passed;
        System.out.println("passed =" + passed);
        System.out.println("failed =" + failed);


        System.out.println("----------------------------------");

        System.out.println( true == !false && false == !true && true !=!true );
        //                                      true                         true               true



    }
}
