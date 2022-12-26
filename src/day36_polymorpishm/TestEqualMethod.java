package day36_polymorpishm;

import Day30_Inheritance.PhoneTask.iPhone;

public class TestEqualMethod {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5);

        Circle circle2 = new Circle(5);

        Circle circle3 = new Circle(15);

        System.out.println(circle1 == circle2); // false
        System.out.println(circle1.equals(circle2)); // true
        System.out.println(circle1.equals(circle3)); // false


        System.out.println("==============================================");

        iPhone iphone1= new iPhone("apple", "iPhone 13 pro", "medium", 900,  "black");
        iPhone iphone2= new iPhone("apple", "iPhone 13 pro", "medium", 900,  "black");

       // System.out.println(iphone1.equals(circle2)); // Invalid object
        System.out.println(iphone1.equals(iphone2)); // true



    }
}
