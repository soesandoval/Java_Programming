package Day07_IfStatements;

public class Grade2 {
    public static void main(String[] args){

        char grade = 'A' ;

        String result = " ";

        if (grade=='A'){
            result="Excellent";
        } else if (grade=='B'){
            result="Great Job";
        } else if(grade=='C'){
            result="Good";
        }else if(grade=='D'){
            result="Passed";
        }else{
            result="Failed";
        }

        System.out.println(result);
    }
}
