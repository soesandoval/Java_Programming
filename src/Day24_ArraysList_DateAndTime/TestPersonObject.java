package Day24_ArraysList_DateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestPersonObject {
    public static void main(String[] args) {


        Person[] people = {new Person(), new Person(), new Person(), new Person(), new Person()};

        people[0].setInfo(LocalDate.of(2002,4,9), "Sofia",'F');
        people[1].setInfo(LocalDate.of(2000,4,15), "Lorenso",'M');
        people[2].setInfo(LocalDate.of(1999,3,20), "Julissa",'F');
        people[3].setInfo(LocalDate.of(1975,7,4), "Karen",'F');
        people[4].setInfo(LocalDate.of(2019,2,14), "Hailey",'F');

        ArrayList<Person> StudentsList= new ArrayList<>();

        StudentsList.addAll(Arrays.asList(people));


        StudentsList.removeIf(p -> p.dateOfBirth.getYear() < 1997) ;


        for (Person each : StudentsList) {
            System.out.println(each.name + " is younger than 25");

        }


    }
}
