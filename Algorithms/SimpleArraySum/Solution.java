import java.util.Arrays;
import java.util.List;
public class Solution {
    public static void main(String[] args) {

        // int[] ar = { 1, 2, 3, 4, 10, 11 };
        // Solution.calculateSimpleArraySum(ar);

        Integer[] intArr = { 1, 2, 3, 4, 10, 11 };
        List<Integer> ar = Arrays.asList(intArr);
        Solution.calculateSimpleArraySum(ar);
        // System.out.println(ar);
    }

    // public static int calculateSimpleArraySum(int[] ar){
    // //count then sum the elements of array
    // int counter = 0;
    // int sum = 0;
    // for(int i = 0;i<ar.length;i++){
    // sum += ar[i];
    // counter++;
    // }

    // System.out.println(counter);
    // System.out.println(sum);
    // return 0;
    // }

    public static int calculateSimpleArraySum(List<Integer> ar) {
        int counter = ar.size();
        int sumElementsOfArray = 0;
        for(int i:ar){
            sumElementsOfArray +=i;
        }
         
        System.out.println(counter);
        System.out.println(sumElementsOfArray);
        return sumElementsOfArray;
    }
}