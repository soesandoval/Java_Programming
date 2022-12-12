package Day14_MethodOverloading;

public class MethodOverloadingPractice {
    public static void main(String[] args) {

        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,3,4));
        System.out.println(sum(.05, 10.25));
    }

    public static int sum(int num1, int num2){

        return num1 + num2;
    }

    public static int sum(int num1, int num2, int num3){

        return num1 + num2 + num3 ;
    }

    public static int sum(int num1, int num2, int num3, int num4) {

        return num1 + num2 + num3 + num4 ;

    }
    public static double sum(double num1, double num2){

        return num1 + num2 ;
}
     public static double sum(double num1, double num2, double num3){

        return num1 + num2 + num3;
     }
     public static double sum(double num1, double num2, double num3, double num4){

        return num1+ num2 + num3 + num4;
     }

}
