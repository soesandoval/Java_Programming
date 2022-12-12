package Day25_Constructor;

import java.time.LocalDate;

public class TestEmployeeObjects {


    public static void main(String[] args) {


        Employee e1 = new Employee("Sofia",20,'F', "SDET",20000.00, LocalDate.of(2022,9,4));

        System.out.println(e1);



    }


}
