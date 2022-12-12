package Day16_NestedLoops;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String sentence = "Java Java Java Java" ;
        String word = "Java" ;
        int count = 0;


            while (sentence.contains(word)){
                count ++;
                sentence = sentence.replaceFirst(word, " ");

            }

        System.out.println(count);





        }
}
