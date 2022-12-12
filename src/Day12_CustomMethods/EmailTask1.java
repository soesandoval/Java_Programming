package Day12_CustomMethods;
import java.util.Scanner;
public class EmailTask1 {
    public static void main(String[] args) {

        String email = "mike_tyson@gmail.com";

        String firstName= email.substring(0, email.indexOf("_"));

        String LastName= email.substring(email.indexOf("_") + 1,  email.indexOf("@"));

        String rest = email.substring( email.indexOf("@"));


        System.out.println(firstName);
        System.out.println(LastName);
        System.out.println(rest);

        email = firstName + "_" + LastName + rest ;

        System.out.println(email);


    }
}
