package Day23_ArraysList;
import java.util.ArrayList;
public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl"); // 0
        names.add("Vasyl"); // 1
        names.add("Sumeye"); //2
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        ArrayList<String> nonDup = new ArrayList<>();

        for (String each: names){
            if (nonDup.contains(each)) {
                continue;
            }

            nonDup.add(each);
        }

names = nonDup;
        System.out.println(nonDup);

        System.out.println("===================================");

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1;

        list1.add(10);

        System.out.println(list2);
        System.out.println(list1);

        System.out.println(list1==list2);

        ArrayList<Integer> L1 = new ArrayList<>();
        ArrayList<Integer> L2 = new ArrayList<>();

        L1.add(2);
        L2.add(2);

        System.out.println(L1);
        System.out.println(L2);

        System.out.println(L1.equals(L2));

        System.out.println("======================================");

        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(10);
        n2.add(30);
        n2.add(20);

        System.out.println(n1.equals(n2));

        System.out.println(n1.isEmpty());
        System.out.println(n2.isEmpty());

        n1.clear();
        n2.clear();

        System.out.println(n2.isEmpty());
        System.out.println(n1.isEmpty());









    }
}
