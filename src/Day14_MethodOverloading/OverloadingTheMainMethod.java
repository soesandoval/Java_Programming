package Day14_MethodOverloading;

public class OverloadingTheMainMethod {

    public static void main(String[] args) {
        System.out.println("A");
    }

    public static void main(double args ){
        System.out.println("B");

    }

    public static void main(boolean args) {
        System.out.println("C");

    }




}
