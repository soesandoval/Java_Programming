package Utilities;

import java.util.Arrays;

public class ArraysUtility {


        public static boolean contains ( int[] array, int element){
            for (int each : array) {
                if (each == element) {
                    return true;
                }
            }
            return false;
        }

        public static boolean contains ( double[] array, double element){
            for (double each : array) {
                if (each == element) {
                    return true;
                }
            }
            return false;
        }

        public static boolean contains ( char[] array, char element){
            for (char each : array) {
                if (each == element) {
                    return true;
                }
            }
            return false;
        }

        public static boolean contains (String[]array, String element){
            for (String each : array) {
                if (each.equals(element)) {
                    return true;
                }
            }
            return false;
        }


        public static int[] addElement ( int[] array, int element){
            int[] newArray = Arrays.copyOf(array, array.length + 1);
            newArray[newArray.length - 1] = element;
            return newArray;
        }

        public static double[] addElement ( double[] array, double element){
            double[] newArray = Arrays.copyOf(array, array.length + 1);
            newArray[newArray.length - 1] = element;
            return newArray;
        }

        public static char[] addElement ( char[] array, char element){
            char[] newArray = Arrays.copyOf(array, array.length + 1);
            newArray[newArray.length - 1] = element;
            return newArray;
        }

        public static String[] addElement (String[]array, String element){
            String[] newArray = Arrays.copyOf(array, array.length + 1);
            newArray[newArray.length - 1] = element;
            return newArray;
        }


        public static int[] merge ( int[] array, int[] array2){
            int array3[] = new int[array.length + array2.length]; // to make sure third array has enough capacity

            int k = 0;

            for (int i = 0; i < array.length; i++, k++) {
                array3[k] = array[i];
            }

            for (int i = 0; i < array2.length; i++, k++) {
                array3[k] = array2[i];
            }

            return array3;
        }

        public static double[] mergeD ( double[] array, double[] array2){
            double array3[] = new double[array.length + array2.length]; // to make sure third array has enough capacity

            int k = 0;

            for (int i = 0; i < array.length; i++, k++) {
                array3[k] = array[i];
            }

            for (int i = 0; i < array2.length; i++, k++) {
                array3[k] = array2[i];
            }

            return array3;
        }

        public static char[] mergeCh ( char[] array, char[] array2){
            char array3[] = new char[array.length + array2.length]; // to make sure third array has enough capacity

            int k = 0;

            for (int i = 0; i < array.length; i++, k++) {
                array3[k] = array[i];
            }

            for (int i = 0; i < array2.length; i++, k++) {
                array3[k] = array2[i];
            }

            return array3;
        }

        public static String[] mergeS (String[]array, String[]array2){
            String array3[] = new String[array.length + array2.length]; // to make sure third array has enough capacity

            int k = 0;

            for (int i = 0; i < array.length; i++, k++) {
                array3[k] = array[i];
            }

            for (int i = 0; i < array2.length; i++, k++) {
                array3[k] = array2[i];
            }

            return array3;
        }

        public static int[] reverse ( int[] array){
            int[] reverse = new int[array.length];

            for (int i = array.length - 1, j = 0; i >= 0; i--) {
                reverse[j++] = array[i];
            }
            return reverse;
        }

        public static double[] reverseD ( double[] array){
            double[] reverse = new double[array.length];

            for (int i = array.length - 1, j = 0; i >= 0; i--) {
                reverse[j++] = array[i];
            }
            return reverse;
        }

        public static char[] reverseCh ( char[] array){
            char[] reverse = new char[array.length];

            for (int i = array.length - 1, j = 0; i >= 0; i--) {
                reverse[j++] = array[i];
            }
            return reverse;
        }

        public static String[] reverseS (String[]array){
            String[] reverse = new String[array.length];

            for (int i = array.length - 1, j = 0; i >= 0; i--) {
                reverse[j++] = array[i];
            }
            return reverse;
        }

    }
