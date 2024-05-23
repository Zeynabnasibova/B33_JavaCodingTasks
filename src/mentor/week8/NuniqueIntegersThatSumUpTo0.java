package mentor.week8;

import java.util.Arrays;

public class NuniqueIntegersThatSumUpTo0 {
    /*Write a function:
    that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
    The function can return any such array. For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
    The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
    For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).*/
    public static void main(String[] args) {
        Solution2(4);

        int[] d = Solution(5);
        System.out.println(Arrays.toString(d));
    }

    public static int[] Solution(int N) {
        int[] result = new int[N];
        int sum = 0;
        for (int i = 0; i < N - 1; i++) {
            result[i] = i;
            sum += i;
        }
        result[N - 1] = -sum;
        return result;
    }

    public static void Solution2(int N) {
        int[] result = new int[N];
        int sum = 0;
        for (int i = 0; i < N - 1; i++) {
            result[i] = i;
            sum += i;
        }
        result[N - 1] = -sum;
        System.out.println(Arrays.toString(result));
    }
}
