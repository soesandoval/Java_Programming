package Day16_NestedLoops;

public class FrequencyOfAChar {
    public static void main(String[] args) {

        //FINDS OUT HOW MANY CHARACTERS THERE IS IN THE VARIABLE STR


        String str = "cccccaabbbccc";
        char ch = 'c';

        int count = 0;

        for (int i = 0; i < str.length() ; i++) { //index number of str

            if (str.charAt(i) == ch){
                count++;
            }
        }

        System.out.println(count);

    }
}
