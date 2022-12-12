package Day22_ArraysList;

public class WrapperIntro {
    public static void main(String[] args) {

            String str ="Java";

            int a1 = 10;
            Integer a2 = 10;

        System.out.println("===============================");

        int b1 = 100;

        double c1 = b1;
        long c2 = b1;

        Integer b2 = b1; // auto boxing
        // Long b3 = b2 (Error)

        char ch = 'A';

        Character ch2 = ch; // auto boxing

        double d1= 5.5;

        Double d2 = d1; // auto boxing

        System.out.println("=================================");

        Integer n1 = 26;

        int n2 = n1; // unboxing
        // long n3 = n1 (Error)
        // double n4 = n1 (Error)

        Character e1 = 'Z';

        char e2 = e1; // unboxing






    }
}
