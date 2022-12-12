package Day18_GarbageCollection;

class Car{
    public String brand;
    public String color;
    public  String model;
    public int year;
}



public class MemoryAllocation {

    public static void main(String[] args) {

int a = 100;  // stack

Car car = new Car();
// stack    // heap

    }

    public static  void method1(){
        int b = 300; // stack

    }


    public static  void method2(){
        String h = " Hello World ";
        // stack          // heap (String pool)

        String c = new String("Hello");
        // stack                         //heap


    }

}
