package Day23_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println(max);
        System.out.println(min);

        System.out.println("=================================");

        ArrayList<String> items = new ArrayList<>();
        items.addAll(Arrays.asList("Eggs","Strawberries","Rice","Orange","Potato","Blueberry"));

        Collections.sort(items);

        System.out.println(items);

        System.out.println("=====================================");

        Collections.reverse(items);

        System.out.println(items);

        System.out.println("=====================================");

        ArrayList<String > students = new ArrayList<>();

        students.addAll(Arrays.asList("Sofia","Lorenso","Muhtar","Karen"));

        System.out.println(students);

        Collections.swap(students,0,1);

        System.out.println(students);

        Collections.swap(students,0,students.size()-1);

        System.out.println(students);

        System.out.println("======================================");





    }
}
