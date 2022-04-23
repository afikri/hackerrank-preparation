import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Integer[] intArr = {-4, 3, -9, 0, 4, 1};
        List<Integer> arr = Arrays.asList(intArr);
        Solution.plusMinus(arr);

    }

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int pNr = 0;
        int nNr = 0;
        int zNr = 0;
        double fP = 0.0;
        double fN = 0.0;
        double fZ = 0.0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0){
                pNr++;
                fP = (double)pNr/arr.size();
            }
                
            if (arr.get(i) < 0){
                nNr++;
                fN = (double)nNr/arr.size();
            }

            if (arr.get(i) == 0){
                zNr++;
                fZ = (double)zNr/arr.size();
            }
                
        }
        System.out.println(String.format("%.6f",fP));
        System.out.println(String.format("%.6f",fN));
        System.out.println(String.format("%.6f",fZ));
    }

}