package Day12_CustomMethods;

public class CustomMethodsPractice {

    public static void main(String[] args) {

        MaxNum(1000,1000);

        System.out.println("=====================");

        MaxNum(-200,-250);

        initial("Sofia", "Sandoval");

        System.out.println("--------------------------------------");

        initial("Karen", "Mena");

    }

    public static void MaxNum(double num1, double num2){

        if(num1>num2){
            System.out.println(num1 + " is the maximum number");
        }else if(num2 > num1){
            System.out.println(num2 + " is the maximum number");
        }else{
            System.out.println("Equal");
        }

    }

    public static void initial(String firstName, String lastName){

        String initial = firstName.charAt(0) +  "." +  lastName.charAt(0);
        System.out.println("Initial is " + initial );


    }

}
