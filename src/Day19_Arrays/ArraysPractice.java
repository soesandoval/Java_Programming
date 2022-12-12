package Day19_Arrays;
import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {

        String myGroup[] = new String[5];

        myGroup[0] ="Gulcin";
        myGroup[myGroup.length-1]= "Aseel";
        myGroup[1]="Abidullah";
        myGroup[2]="Sumeye";
        myGroup[3]="Khashayac";

        System.out.println(Arrays.toString(myGroup));

        System.out.println(myGroup[myGroup.length-1]); //Prints out last index variable of array

        myGroup[1]="Kuzzat";
        myGroup[4]="Muhtar";

        System.out.println(Arrays.toString(myGroup));

        System.out.println("======================================");

        //Print array variables in reverse order
        for (int i = myGroup.length-1; i >= 0 ; i--) System.out.println(myGroup[i]);

        System.out.println("======================================");

        //myGroup.forr is a shortcut for reverse printing or myGroup.fori is a shortcut for printing all variables in order



    }
}
