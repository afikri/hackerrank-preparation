import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        // Integer[] intArr = {1,3,5,7,9};
        Integer[] intArr = { 1, 2, 3, 4, 5 };
        List<Integer> arr = Arrays.asList(intArr);
        solveMiniMaxSum(arr);

    }

    public static void solveMiniMaxSum(List<Integer> arr) {
        long sum = 0;
        long min = arr.get(0);
        long max = arr.get(0);

        for (int i = 0; i < arr.size(); i++) {
            // 15
            sum += arr.get(i);
        }

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }

            if (arr.get(i) < min) {
                min = arr.get(i);
            }
        }
        long m = sum - max;
        long n = sum - min;
        System.out.println(m + " " + n);
    }
}