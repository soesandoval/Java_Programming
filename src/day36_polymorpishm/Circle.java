package day36_polymorpishm;

public class Circle {

    private double radius;

    public final static double pi = 3.14;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
        return radius * radius * pi;
    }

    public double perimeter(){
        return 2 * radius * pi;
    }




}
