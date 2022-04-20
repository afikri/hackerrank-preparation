import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();
        Solution.plusMinus(myList);
        myList.add(1);
        myList.add(-1);
        myList.add(1);
        myList.add(0);
        System.out.println(myList);

    }

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int counter = arr.size();
        System.out.println("Size: "+counter);
    }

}