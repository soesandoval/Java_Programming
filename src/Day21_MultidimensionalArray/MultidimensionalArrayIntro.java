package Day21_MultidimensionalArray;
import java.util.Arrays;
public class MultidimensionalArrayIntro {
    public static void main(String[] args) {


        int [] array = {20, 30,40};
        int [] array2= {50,60,70,80};
        int [] array3 = {90,100,110,120};

        System.out.println("--------------------------------------------------");

        int [] [] array2D = {{10,20,30} ,{40,50,60,70,80} ,{90,100}};

        //  index :             0                    1                2

        System.out.println(array2D.length);


        System.out.println(Arrays.toString( array2D[1] ) ); // [40, 50, 60, 70, 80]
        System.out.println( Arrays.toString( array2D[2] ) ); // [90, 100]
        System.out.println( Arrays.toString( array2D[0] ) ); // [10, 20, 30]

        System.out.println( array2D[2][0] ); // 90

        System.out.println( array2D[1][2]  ); // 60




    }
}
