package Day24_ArraysList_DateAndTime;

import java.time.LocalTime;

public class LocalTimeIntro {
    public static void main(String[] args) {


        LocalTime startingTime = LocalTime.of(10,30);

        System.out.println(startingTime);

        LocalTime rightNow = LocalTime.now();

        System.out.println(rightNow);

        System.out.println("==================================");

        LocalTime time = LocalTime.of(23,59,59);

        System.out.println(time);

        time = time.plusHours(1);

        System.out.println(time);

       time = time.plusMinutes(45);

        System.out.println(time);





    }
}
