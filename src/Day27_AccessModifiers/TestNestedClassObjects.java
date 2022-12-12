package Day27_AccessModifiers;

public class TestNestedClassObjects {

    public static void main(String[] args) {

        Car obj1 = new Car(); // Car object

        obj1.new CarEngine(); // Car engine object

        new Car.StaticInnerClass();

    }



}
