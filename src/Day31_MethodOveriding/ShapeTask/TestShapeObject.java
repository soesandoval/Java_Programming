package Day31_MethodOveriding.ShapeTask;

public class TestShapeObject {

    public static void main(String[] args) {

        Square square = new Square("Square", 5);

        System.out.println(square);

        square.draw();

        Circle circle = new Circle("Circle", 3.5);

        System.out.println(circle);



    }



}
