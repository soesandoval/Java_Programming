package Day11_StringPart2;

public class StringMethods2 {
    public static void main(String[] args) {

        String sentence= "I love Python programming because is in high demand <3";

        sentence= sentence.replace("Python", "Java");

        System.out.println(sentence);

        System.out.println("----------------------------------------------");

        String word = "Java";

        word = word.replace('a', 'e');

        System.out.println(word);

        System.out.println("-------------------------------------------------");

        String sentence2= "I love Java, Java is cool";

        sentence2 = sentence2.replaceFirst("Java", "Python");

        System.out.println(sentence2);

        //=======================================

        String sentence3= "Java is fun, Java is cool, Java is amazing";

        sentence3 = sentence3.replace("Java","Python");

        System.out.println(sentence3);

        System.out.println("--------------------------------------------------");

        String sentence4= "I love Java Programming";

        String languageName = sentence4.substring(7,10);

        System.out.println(languageName);
        //================================================

        String sentence5= "Today is sunday, tomorrow is monday";
        //                            0123456789...

        String today = sentence5.substring(9,14+1);
        System.out.println(today);

        //==========================================

        String email = "CydeoSchoolJavaProgramming@gmail.com";
        int beginning = email.indexOf('@') + 1;
        int ending = email.lastIndexOf('.');

        String domain = email.substring(beginning, ending);
        System.out.println(domain);

        //===========================================

        String sentence6 = "I love Java programming";
        String r1 = sentence6.substring(7, sentence6.length());
        System.out.println(r1);

        //=========================================

        String sentence7= "Today is Sunday, Tomorrow is Monday";

        String tomorrow = sentence7.substring(sentence7.lastIndexOf(' ') +1);

        System.out.println(tomorrow);

        //==========================================

        String sentence8 = "I study at Cydeo school";

        String schoolName = sentence8.substring(11);

        System.out.println(schoolName);

        System.out.println("---------------------------------------");

        String str = "Python" ;

        String result = (str + "\n ").repeat(10);

        System.out.println(result);




    }
}
