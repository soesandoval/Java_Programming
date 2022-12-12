package Day16_NestedLoops;

public class NestedLoopsPractice {
    public static void main(String[] args) {

        String str = "aaabbbcc";

        String result = " " ;

        for (int j = 0; j < str.length() ; j++) {

            char ch = str.charAt(j);
            int count = 0;
            for (int i = 0; i < str.length(); i++) { // responsible for comparing ch to string str and return the frequency
                if(str.charAt(i) == ch){
                    count++;
                }
            }
            if(count ==  2 && !result.contains("" +  ch)){
                result += ch;
            }

        }

        System.out.println(result);






    }
}
