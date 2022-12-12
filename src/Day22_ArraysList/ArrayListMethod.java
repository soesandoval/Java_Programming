package Day22_ArraysList;

import java.awt.event.KeyListener;
import java.util.ArrayList;

public class ArrayListMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        list.add(1,15);

        System.out.println(list);

        list.add(2,25);

        System.out.println(list);

        System.out.println("-----------------------------------------------------------");

        ArrayList<String> studentsList = new ArrayList<>();

        studentsList.add("Sofia");
        studentsList.add("Esther");
        studentsList.add("Molina");
        studentsList.add("Sandoval");

        System.out.println(studentsList.size());
        System.out.println(studentsList);

        String firstStudent = studentsList.get(0);

        String lastStudent= studentsList.get(3);

        System.out.println(firstStudent);
        System.out.println(lastStudent);





    }
}
