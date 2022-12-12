package Day27_AccessModifiers;

public class AccessModifiers {


    public static int publicDate = 200;

    protected static int protectedData= 300;

     static int defaultDate=400;

     private static int privateData=500;

     public AccessModifiers(){

     }

     protected static void access(){
         System.out.println("protected");
     }

     static void defaultAccess(){
         System.out.println("Default");
     }

     private static void privateAccess(){
         System.out.println("private");
     }

    public static void main(String[] args) {
        System.out.println(publicDate); //accessible from within the same class
        System.out.println(protectedData); // accessible within the same class but not always outside the package
        System.out.println(defaultDate); // accessible within the same class but never outside the package
        System.out.println(privateData);// ONLY accessible within the same class

        new AccessModifiers();



    }





}
