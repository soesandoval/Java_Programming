package day37_exceptions;

import day36_polymorpishm.Circle;

public class TestPizzaObject {

    public static void main(String[] args) {

        Pizza pizza1= new Pizza('S', 2,3);

        Pizza pizza2= new Pizza('S', 2,3);

        System.out.println(pizza1 == pizza2); // false because it is not the same object

        System.out.println(pizza1.equals(pizza2)); // true because objects have the same properties

        Object obj = new Pizza('L', 4, 5); // upcasting done implicitly

        boolean r = obj.equals(pizza2);

        System.out.println(r);

        double total = ((Pizza)obj).calcCost();

        System.out.println(total);

      // double perimeter = ((Circle)obj).perimeter();

       // System.out.println(perimeter);// Class Cast Exception because there is no relation with circle and obj of pizza







    }


}
