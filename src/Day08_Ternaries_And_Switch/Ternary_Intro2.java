package Day08_Ternaries_And_Switch;

public class Ternary_Intro2 {
    public static void main(String[] args){

        int number = 100;
        String result = (number >0)? "Positive" : (number <0) ? "Negative" : "Zero";

        System.out.println(result);

        System.out.println("----------------------------------------------------------------");

int n=1;

String day = ( n==1)? "Monday" : (n==2)? "Tuesday" : (n==3)? "Wednesday" : (n==4)? "Thursday" :
        (n==5)? "Friday" : (n==6)? "Saturday" :  "Sunday";
        System.out.println(day);

        System.out.println("----------------------------------------------------------------");
        int n1 = 10;

        String month= (n1==1)? "January" : (n1==2)? "February" : (n1==3)? "March" : (n1==4)? "April" :
                (n1==5)? "May" : (n1==6)? "June" : (n1==7)? "July" : (n1==8)? "August" :(n1==9)? "September" :
                        (n1==10)? "October" : (n1==11)? "November" : "December" ;

        System.out.println(month);


    }
}
