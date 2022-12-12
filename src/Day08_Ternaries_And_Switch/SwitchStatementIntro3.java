package Day08_Ternaries_And_Switch;

public class SwitchStatementIntro3 {
    public static void main(String[] args){
        int score = 85;// 0 ~ 100
        String result = "";

        if (score >= 90) {
            result = "A";
        } else if (score >= 80 ) {
            result = "B";
        } else if (score>=70) {
            result = "C";
        } else if (score>=60){
            result = "D";
        }else {
            result="F";
        }

        System.out.println(result);
        // THIS TASK CANNOT BE EFFICIENTLY DONE WITH SWITCH STATEMENT
        //basically switch does not use boolean conditions
        //Switch statement is for individual statements rather than range statements...


    }
}
