package Day11_StringPart2;

public class StringMethods3 {

    public static void main(String[] args) {

        String word = "";

        boolean r1 = word.isEmpty();

        System.out.println(r1);// true

        //============================================

        String str = "                                              ";

        boolean r2 = str.isBlank();

        System.out.println(r2); // true

        //=============================================

        String str1 = "Cydeo";
        String str2 = new String("Cydeo");

        System.out.println(str1== str2);//false
        System.out.println(str1.equals(str2));//true

        //==============================================

        String s1= "Cydeo";
        String s2= new String("cydeo");

        System.out.println(s1.equalsIgnoreCase(s2)); // TRUE

        //===========================================

        String students  = " Hasan, Naran, Sumeye, Natalia ";
        boolean hasAhmed = students.contains("Ahmend");
        System.out.println("has Ahmed: " + hasAhmed); // FALSE

        String sentence = "My favorite programming language is JAVA";
        boolean hasJava= sentence.toLowerCase().contains("java");

        System.out.println(hasJava);// TRUE

        // ==============================================

        String name = "Michael";

        boolean l = name.startsWith("Da");
        System.out.println(l);// FALSE

        String url = "www.cydeo.com";

        boolean isValid = url.startsWith("www.");
        System.out.println(isValid);// TRUE

        boolean t= url.endsWith(".com");
        System.out.println(t); // TRUE

        //==========================================

        String  email = "Cydeoschool@gmail.com";
        boolean isGmail= email.endsWith("gmail.com");
        boolean isYahoo= email.endsWith("yahoo.com");
        boolean isHotmail= email.endsWith("hotmail.com");

        System.out.println("isGmail = " + isGmail);
        System.out.println("isYahoo = " +isYahoo);
        System.out.println("isHotmail = " +isHotmail);






    }
}
