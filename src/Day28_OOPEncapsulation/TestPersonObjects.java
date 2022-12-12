package Day28_OOPEncapsulation;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person("Sofia");

        Person person2 = new Person("Sofia","Spanish");

        Person person3 = new Person("Esther", 'F');

        Person person4 = new Person("Molina", 25, 'F', "German");


        System.out.println(person1);

        System.out.println(person2);

        System.out.println(person3);

        System.out.println(person4);

        Person.planet = "Mars";

        System.out.println(person1);

        Person.printPlanetName();

        person1.eat("Chocolate");


    }



}
