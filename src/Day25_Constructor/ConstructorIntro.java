package Day25_Constructor;

public class ConstructorIntro {




    public ConstructorIntro(int a){
        System.out.println("Object is created by using int argument");

   }

   public ConstructorIntro(String a){
       System.out.println("Object is created by using String argument");

   }

    public void add() {

    }


    public static void main (String [] args){

        ConstructorIntro obj1 = new ConstructorIntro(10);

        ConstructorIntro obj2 = new ConstructorIntro("Java");


    }




}
