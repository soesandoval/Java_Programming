package day34_abstraction;

public class TestCarObjects {

    public static void main(String[] args) {

        Audi audi = new Audi( "Q6", "Black", 2002, 200000.00);

        Honda honda = new Honda( "CRV", "Grey", 2014, 70000);

        Tesla tesla = new Tesla("Model Y", "white", 2013, 500000);

        System.out.println("=====================================");

        System.out.println(audi);
        System.out.println(honda);
        System.out.println(tesla);

        audi.start();
        tesla.start();
        audi.stop();
        tesla.stop();
        tesla.autoPilot();
        audi.autoPark();
        honda.start();
        honda.stop();




    }



}
