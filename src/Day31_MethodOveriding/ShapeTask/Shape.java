package Day31_MethodOveriding.ShapeTask;

public class Shape {

    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }

    public void draw(){
        System.out.println("drawing a shape");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name=  '" + name + '\'' +
                "area=  '" + area() + '\'' +
                "perimeter=  " + perimeter() + '\'' +
                '}';
    }
}
