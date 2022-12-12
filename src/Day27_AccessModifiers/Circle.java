package Day27_AccessModifiers;

public class Circle {


    public double radius, diameter;

    public static double pi = 3.14;

    public Circle(double radius){
        this.radius = radius;
        diameter = radius * 2;
    }

    public  double calcArea(){
        return  radius * radius * pi;
    }


    public double calcPerimeter(){
        return diameter * pi ;
    }

    public static void printPiValue(){
        System.out.println("PI value is: " + pi);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", PI=" + pi +
                ", area=" + calcArea()+
                ", perimeter=" + calcPerimeter()+
                '}';
    }
}
