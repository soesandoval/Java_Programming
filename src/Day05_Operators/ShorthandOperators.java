package Day05_Operators;

public class ShorthandOperators {
    public static void main(String[] args) {

        int a = 20;
        System.out.println(a);// 20
        System.out.println(a);//20

        a = 40;

        System.out.println(a);

        System.out.println("----------------------------------------------------");

        double balance = 100;
        balance += 1000; // balance = 100 + 1000

        System.out.println(balance);

        balance += 500; // balance = 1100 + 500

        System.out.println(balance);

        balance -= 1000; // balance = 11600 - 1000
        System.out.println(balance);

        System.out.println("----------------------------------------------");

        double salary = 45000;

        salary *= 2; // salary = 45000 * 2

        System.out.println(salary);

        salary *= 3;

        System.out.println(salary);

        System.out.println("---------------------------------------------");

        double eth = 4;
        eth*= 250;

        System.out.println("eth=" + eth);

        eth /= 2;

        System.out.println("eth=" + eth);

        System.out.println("------------------------------------------");

        salary /= 2;

        System.out.println(salary);

        System.out.println("----------------------------------------");
        int b = 39;

        b %= 7;

        System.out.println(b);




    }

         }


