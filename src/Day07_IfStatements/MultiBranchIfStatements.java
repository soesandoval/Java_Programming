package Day07_IfStatements;

public class MultiBranchIfStatements {
    public static void main(String[] args){
        int num = 0;
        String result= " ";

        if(num>0){
            result= "positive";
        }
        if (num<0){
            result="negative";
        }
        if (num==0){
            result="zero";
        }
        System.out.println(result);

        System.out.println("------------------------------");

        String result2=" ";

        if(num>0){
            result2= "Positive";
        }else if(num<0){
            result2="Negative";
        }else{ result2="Zero";
        }

            System.out.println(result2);
    }
}
