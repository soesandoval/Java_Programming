package Day23_ArraysList;

import java.util.ArrayList;

public class UniqueElements {
    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl"); // 0
        names.add("Vasyl"); // 1
        names.add("Sumeye"); //2
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        for(String each: names){
            if(names.indexOf(each)== names.lastIndexOf(each)) {// if the first time it appears is also the last time then... element is unique
                System.out.println(each);
            break;
        }}


    }
}
