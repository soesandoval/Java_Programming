package Day25_Constructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {

    public static void main(String[] args) {


        DateTimeFormatter df =  DateTimeFormatter.ofPattern("y/MMMM/dd/EEEE"); // "yy" == 22

        // MMMM == full month MMM== month abbreviation MM= full number of month
        // d == number of the day    // dd == full number of the day
        //EEEE full name of day of the week //E abbreviation of day of the week


        LocalDate today = LocalDate.now();

        System.out.println(today);

        System.out.println(today.format(df));

        LocalDate date1 = LocalDate.of(2022,7,1);

        System.out.println(date1.format(df));






    }
}
