package Day23_ArraysList;

import java.util.ArrayList;

public class AverageNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println(list);

        int sum = 0;

        // FOR EACH LOOP TO SUM ALL NUMBERS IN THE ARRAYLIST
        for (Integer each: list){
            sum += each;
        }

        double average = sum/ (double) list.size();

        System.out.println("Average= " +average);



    }
}
