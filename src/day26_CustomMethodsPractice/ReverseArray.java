package day26_CustomMethodsPractice;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int[] result = reverse(arr);

        System.out.println(Arrays.toString(result));
    }


    //reverses the given array, returns a new array
    public static int[] reverse(int[] array) {  //in parentheses must have information
        int[] result = new int[array.length];

        int j=0;

        for (int i = array.length - 1; i >= 0; i--) {//array.forr //j - index number of new array. when i decreasing, j is incresing
            //2 versiya - for (int i = array.length - 1, j = 0; i >= 0; i--, j++), bez j=0
                result[j++] = array[i];//get each element from array
        }
        return result;
    }

    //reverses the given array, returns a new array
    public static double[] reverse(double[] array) {  //in parentheses must have information
        double[] result = new double[array.length];

        int j=0;

        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }
        return result;
    }

    //reverses the given array, returns a new array
    public static char[] reverse(char[] array) {  //in parentheses must have information
        char[] result = new char[array.length];

        int j=0;

        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }
        return result;
    }

    //reverses the given array, returns a new array
    public static String[] reverse(String[] array) {  //in parentheses must have information
        String[] result = new String[array.length];

        int j=0;

        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }
        return result;
    }


}
