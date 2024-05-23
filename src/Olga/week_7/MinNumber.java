package Olga.week_7;

public class MinNumber {
    public static void main(String[] args) {
        int[] arr = {6, 3, 83, 48, 12, 21, 84, 60};

        min(arr);
    }
    public static void min(int[] num){
        int min=num[0];
        for (int each:num) {
            if(each<min){
                min=each;
            }
        }
        System.out.println(min);
    }
}
