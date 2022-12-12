package Day08_Ternaries_And_Switch;

public class TernariesIntro {
    public static void main(String[] args){

        int score= 85;
        String result ;
        String result2;
        if(score>=60){
            result = "Passed";
        }else {
            result="Failed";
        }

        System.out.println(result);

        System.out.println("---------------------------------------");

        result2 = (score>= 60) ? "Passed" : "Failed" ;

        System.out.println(result2);
        System.out.println("------------------------------------------");

        String result3;
int age=21;

      result3=  (age>=21) ? "Eligible" : "Not Eligible";

        System.out.println(result3);


    }

}
