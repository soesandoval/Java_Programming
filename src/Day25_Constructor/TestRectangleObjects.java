package Day25_Constructor;

public class TestRectangleObjects {

    public static void main(String[] args) {


      /*  Rectangle rectangle1 = new Rectangle();

        rectangle1.setInfo(10.0,20.0);


        Rectangle rectangle2 = new Rectangle();

        rectangle2.setInfo(30.0,50.0);

        Rectangle rectangle3 = new Rectangle();

        rectangle3.setInfo(40.0,70.0);

        Rectangle rectangle4 = new Rectangle();

        rectangle4.setInfo(5000.0,30.0);

        Rectangle rectangle5 = new Rectangle();

        rectangle5.setInfo(1029820.0,0.9); */

        Rectangle rectangle1 = new Rectangle(10.0,20.0);

        Rectangle rectangle2 = new Rectangle(20.0,30.0);

        Rectangle rectangle3 = new Rectangle(100.0,200.0);

        Rectangle rectangle4 = new Rectangle(150.0,205.0);

        Rectangle rectangle5 = new Rectangle(1700.0,270.0);



        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);
        System.out.println(rectangle4);
        System.out.println(rectangle5);


    }



}
