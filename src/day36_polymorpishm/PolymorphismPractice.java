package day36_polymorpishm;

import Day30_Inheritance.PhoneTask.Nokia;
import Day30_Inheritance.PhoneTask.PhoneTask;
import Day30_Inheritance.PhoneTask.Samsung;
import Day30_Inheritance.PhoneTask.iPhone;

import java.util.function.IntPredicate;

public class PolymorphismPractice {


    public static void main(String[] args) {

        PhoneTask[] phones = {
                new iPhone("Apple", "iPhone 12", "Large",2000.0, "Pink"),
                new Nokia("Nokia", "Brick", "small", 50, "Pink"),
                new Samsung("Samsung", "Galaxy s22", "Medium",1100.00 , "White")
        };

        for (PhoneTask eachPhone: phones) {

            System.out.println(eachPhone.getModel() + " " + eachPhone.getColor() + " " + eachPhone.getPrice());
        }

        System.out.println("================================================");


        int countIphone =0;

        for (PhoneTask each: phones) {
            if(each instanceof  iPhone){
                countIphone ++;
            }
        }

        System.out.println("Amount of iPhones " + countIphone);

        int countSamsung=0;

        for (PhoneTask each: phones) {
            if(each instanceof  Samsung){
                countSamsung ++;
            }
        }

        System.out.println("Amount of Samsungs " + countSamsung);


        int countNokia=0;

        for (PhoneTask each: phones) {
            if(each instanceof  Nokia){
                countNokia ++;
            }
        }

        System.out.println("Amount of Nokias " + countNokia);


        System.out.println("====================================================");

        for (PhoneTask each : phones) {
            if(each instanceof iPhone || each instanceof  Samsung){
                if(each.getPrice() >= 700){
                    System.out.println("Price is greater than $700 = " + each.getModel());
                }
            }
        }





    }
}
