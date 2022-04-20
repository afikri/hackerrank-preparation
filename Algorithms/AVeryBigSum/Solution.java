import java.util.List;

public class Solution {
    public static void main(String[] args) {

        // int n = 5;
        // long ar[] = { 1000000001, 1000000002, 1000000003, 1000000004, 1000000005 };
        List<Long> = 
        Solution.aVeryBigSum(ar);

    }

    // public static long aVeryBigSum(int n, long[] ar) {
    // // 5
    // // 1000000001 1000000002 1000000003 1000000004 1000000005
    // long sum=0;
    // for(int i = 0;i <n;i++){
    // sum = sum + ar[i];
    // }
    // System.out.println(sum);

    // return sum;

    // }
    // public static long aVeryBigSum(long[] ar) {
    //     long sum = 0;
    //     for (long a : ar)
    //         sum += a;
    //     System.out.println(sum);
    //     return sum;
    // }

        public static Long aVeryBigSum(List<Long> arr){
            Long sum = 0L;
            for(Long a: arr){
                sum += a;
            }
            return sum;
        }
}