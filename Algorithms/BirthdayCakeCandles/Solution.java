import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Integer[] candlesArr = { 3, 2, 1, 3};
        List<Integer> tallestCandlesArr = Arrays.asList(candlesArr);
        birthdayCakeCandles(tallestCandlesArr);
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        // 1. Sort
        Collections.sort(candles);
        System.out.println(candles);

        // count the duplicate of the last element
        int max = 0;
        int lastElem = candles.get(candles.size()-1);
        for(int i = 0; i<candles.size();i++){
            if (candles.get(i)== lastElem) {
                max++;
            }
        }
        System.out.println(max);
        return max;
    }
}