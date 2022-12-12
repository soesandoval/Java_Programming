package Day19_Arrays;
import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        int score1 = 85; // 75; // compile error
        int score2 = 75;
        int score3 = 65;
        int score4 = 55;
        int score5 = 95;

        //IN JAVA THERE IS THREE DATA STRUCTURES: ARRAY, COLLECTION, MAP

        System.out.println("================================");

        int score[]= new int[5]; // index = 0 ~ 4 not 1 ~ 5

        score[2] = 78;
        score[3]=67;
        score[0]= 93;
        score[1]= 01;
        score[4]=95;

        // score[5] = 97; //compile error
        // score [-1] = 07; // compile error

        score = new int[10]; // THE ONLY WAY TO REASSIGN A VARIABLE'S NUMBER OF ARRAYS
              // Index number  0 ~ 9  // it has not stored any values (past values are considered garbage collection)

        score [2] = 67;

        System.out.println( Arrays.toString(score) ); //THIS IS THE WAY TO PRINT ALL ARRAYS
        System.out.println(score[2]);   // returns only index 2 value!!!

        System.out.println("========================");

        for (int i = 0; i < score.length; i++) { // i = index numbers of score array
            System.out.println(score[i]);
        }

        System.out.println("----------------------------------------------");

        System.out.println(score[score.length-1]); // last index number of array


    }
}
