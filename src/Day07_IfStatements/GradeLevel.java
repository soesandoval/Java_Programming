package Day07_IfStatements;

public class GradeLevel {
    public static void main(String[] args){
        int gradeLevel= 17;
        String result=" ";

        if(gradeLevel>0 && gradeLevel<6){
            result="Elementary School";
        }else if(gradeLevel<9){
            result="Middle School";
        }else if(gradeLevel<13){
            result="High School";
        }else if(gradeLevel<17){
            result="College";
        }else if(gradeLevel<19){
            result="Grad School";
        }
        System.out.println(result);
    }
}
