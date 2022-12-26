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

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area =" + area() +
                "perimeter=" + perimeter()+
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Circle)) { // if object is not circle, then it should not be compared
            System.err.println("Invalid object");
            System.exit(1);
        }

        if (radius == ((Circle) obj).radius){ // if the current circle's radius is equal to the given circle's radius, then they equal each other
            return true;
        }

        return false;

    }





    }

