import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Integer[] candlesArr = { 3, 2, 1, 3 };
        List<Integer> tallestCandlesArr = Arrays.asList(candlesArr);
        birthdayCakeCandles(tallestCandlesArr);
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int max = candles.get(0);
        int ctrMax = 0;
        for (int i = 0; i < candles.size(); i++) {
            if (candles.get(i) > max) {
                max = candles.get(i);
                ctrMax++;
            }
        }
        System.out.println(ctrMax);
        return 1;
    }
}