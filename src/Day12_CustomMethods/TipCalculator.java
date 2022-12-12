package Day12_CustomMethods;
import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Split or No split? (Yes or No)");
        String yesNo= input.next();

        System.out.println("Enter the number of people: ");
        int numberOfPeople= input.nextInt();

        System.out.println("Enter your check amount: ");
        double amount = input.nextDouble();

        System.out.println("How was the service quality?   Excellent/Great/Good/Fair/Poor");
        String service = input.next();

        double totalTip= (service.equals("Excellent"))?  amount* 0.25
        : (service.equals("Great"))? amount * 0.2
                :(service.equals("Good"))? amount * 0.15
                :(service.equals("Fair"))? amount * 0.1
                : amount *0.05;

        double totalToPay = amount + totalTip ;

        System.out.println("Number of people: " + numberOfPeople);
        System.out.println("Total to pay: "+ totalToPay);
        System.out.println("Total tip: "+ totalTip);

        if(yesNo.equals("yes")) {
            System.out.println("Total per person: " + (totalToPay/numberOfPeople));
            System.out.println("Tip per person: " + (totalTip/numberOfPeople));
        }






    }
}
