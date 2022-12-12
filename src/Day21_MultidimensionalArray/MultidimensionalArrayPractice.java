package Day21_MultidimensionalArray;

import java.util.Arrays;

public class MultidimensionalArrayPractice {
    public static void main(String[] args) {


        String [] group1 = {"Sofia", "Esther", "Karen","Maria"};
        String [] group2 = {"Lorenso","Rigoberto","Jose"};
        String [] group3 = {"Julie", "Carolina", "Josue","Joaquin","Hailey"};
        String [] group4 = {"Fernanda", "Dexter"};

        String [] [] Groups = {group1,group2,group3,group4};

        for (int i = 0; i < Groups.length; i++) {
            String[] eachGroup = Groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (int j = 0; j < eachGroup.length; j++) {
                String eachStudent = eachGroup[j];
                System.out.println(eachStudent);
            }

        }

        System.out.println("=================================");

        for (String [] eachGroup : Groups) {
            System.out.println(eachGroup);
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }
        }

        System.out.println("=================================");

        System.out.println(Arrays.toString(Groups)); // hashcode

        System.out.println(Arrays.deepToString(Groups));



    }
}
