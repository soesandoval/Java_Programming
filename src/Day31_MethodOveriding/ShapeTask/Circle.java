package Day31_MethodOveriding.ShapeTask;

public class Circle extends Shape{

    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double area() {
        return radius * radius *  3.14;
    }

    @Override
    public double perimeter() {
        return 6.28 * radius;
    }

    @Override
    public void draw() {
        super.draw();

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "area= " + area() +
                "perimeter= " + perimeter() +
                '}';
    }
}
