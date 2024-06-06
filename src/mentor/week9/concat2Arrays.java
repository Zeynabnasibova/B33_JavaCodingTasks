package mentor.week9;

import java.util.Arrays;

public class concat2Arrays {

//Write a return method that can concate two arrays

    public static void main(String[] args) {
//Write a return method that can concate two arrays
        int[] a1 = new int[]{1, 2, 3, 4, 5};
        int[] a2 = new int[]{6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(concatTwoArrays(a1, a2)));
        System.out.println(Arrays.toString(concatTwoArrays(new int[]{1, 2, 3}, new int[]{4, 5, 6})));
    }

    public static int[] concatTwoArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0;
        for (int each : arr1) {
            result[i] = each;
            i++;
        }

        for (int each : arr2) {
            result[i] = each;
            i++;
        }
        return result;
    }

}
