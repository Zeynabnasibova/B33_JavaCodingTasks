package PalwashayKhan.week7;

public class ArrayFindMinimum {
    // Write a method that can find the minimum  number from an int Array

    public static void main(String[] args) {
        int[] arr = {99,12, 23, 32, 44, 57, 6};

        System.out.println(minValue(new int[] {150,5,8,9,15}));
        System.out.println(minValue(arr));
        min(arr);
    }

    public static int minValue( int[]  n ) {
        int min = Integer.MAX_VALUE;
        for(int each: n)
            if(each < min)
                min = each;
        return min;
    }
    public static void min(int[] n){
        int min=n[0];
        for (int each:n) {
            if(each<min){
                min=each;
            }
        }
        System.out.println(min);
    }
}

