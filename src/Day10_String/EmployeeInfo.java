package Day10_String;
import java.util.Scanner;
public class EmployeeInfo {
    public static void main(String [] args){
        Scanner input= new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName= input.nextLine();

        System.out.println("Enter your age: ");
        byte age = input.nextByte();

        System.out.println("Enter your gender:  " );
        char gender = input.next().charAt(0);

        input.nextLine();

        System.out.println("Enter your company name: ");
        String companyName= input.nextLine();

        System.out.println("Enter your job title: ");
        String jobTitle = input.nextLine();

        System.out.println("Enter your salary: ");
        double salary = input.nextDouble();

        System.out.println("Full name= " + fullName);
        System.out.println("Age = " + age);
        System.out.println("Gender= " + gender);
        System.out.println("Company name= "+ companyName);
        System.out.println("Job title= " + jobTitle);
        System.out.println("Salary= " + salary);

        input.close();

    }
}
