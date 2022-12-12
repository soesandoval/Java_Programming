package Day19_Arrays;

public class MaximumNumber {
    public static void main(String[] args) {
        
        int numbers [] = {100, 20, 500, 40, -10, 35};
        
        int max = numbers[0]; // assume that first element is the maximum number

        for (int i = 1 ; i < numbers.length ; i++) { // 1, 2, 3, 4, 5,......

            if (numbers[i] > max){ // compares the elements of the array with the current maximum number found
                max = numbers[i]; // replace the current maximum number
            }
        }

        System.out.println("Maximum number = " + max);
        
        
        
        
    }
}
