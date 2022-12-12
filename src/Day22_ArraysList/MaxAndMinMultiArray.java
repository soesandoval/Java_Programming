package Day22_ArraysList;

public class MaxAndMinMultiArray {
    public static void main(String[] args) {

        int [][] array = {{100,20,300}, {10,1000,50},{-200,400,0}};

        int max = array[0][0];

        for (int [] each1D :array){
            for (int eachElement : each1D) {
                if(eachElement > max){
                    max = eachElement;
                }
            }
        }

        System.out.println("Maximum number= " + max);






    }
}
