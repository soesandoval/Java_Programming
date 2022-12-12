package Day19_Arrays;

public class MinimumNumber {
    public static void main(String[] args) {

        int numbers [] = {20, -20, -10, 10, 100, -100};

        int minimum = numbers[0];

        for (int i = 0; i <numbers.length ; i++) {

            if (numbers[i] < minimum){
                minimum = numbers[i];
            }
        }

        System.out.println("Minimum number= " + minimum);




    }
}

