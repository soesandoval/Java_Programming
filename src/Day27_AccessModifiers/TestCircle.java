package Day27_AccessModifiers;

public class TestCircle {
    public static void main(String[] args) {

        Circle circle1 = new Circle(3.5);
        Circle circle2 = new Circle(2.5);
        Circle circle3 = new Circle(7);


        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);

        System.out.println("=================================");

        System.out.println(Circle.pi);
      //  System.out.println(Circle.radius);


    }
}
