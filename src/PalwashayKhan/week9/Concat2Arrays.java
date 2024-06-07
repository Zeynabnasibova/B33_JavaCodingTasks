package PalwashayKhan.week9;

public class Concat2Arrays {

    //Write a return method that can concate two arrays
    public static int[] concatenate(int[] first, int[] second) {
        // Create a new array of the combined length
        int[] result = new int[first.length + second.length];

        // Copy the first array into the result array
        System.arraycopy(first, 0, result, 0, first.length);

        // Copy the second array into the result array
        System.arraycopy(second, 0, result, first.length, second.length);

        return result;
    }

    public static void main(String[] args) {
        // Example
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int[] concatenatedArray = concatenate(array1, array2);

        // Print the concatenated array using foreach loop
        for (int element : concatenatedArray) {
            System.out.print(element + " ");
        }
    }
}

