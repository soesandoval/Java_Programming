package Day21_MultidimensionalArray;

public class MultidimensionalArrayPractice2 {
    public static void main(String[] args) {


        int [][][] array3D1 = {              {{1,2},{2,3,5}},         {{6,7,8,9},{10,11,12}}      };
        int [][][] array3D2 = {              {{1,2},{2,3,5}},         {{6,7,8,9},{10,11,12}}      };
        int [][][] array3D3 = {              {{1,2},{2,3,5}},         {{6,7,8,9},{10,11,12}}      };

                int [][][][] array4D = {array3D1, array3D2, array3D3};

        for (int [][][] each3D : array4D ) {
            for (int [][] each2D : each3D) {
                for (int [] each1D : each2D) {
                    for ( int eachElement : each1D) {
                        System.out.println(eachElement);
                    }
                }
            }

        }

    }
}
