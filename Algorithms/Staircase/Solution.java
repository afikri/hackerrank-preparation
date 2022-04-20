public class Solution {
    public static void main(String[] args) {
        Solution.starcase(4);
    }

    public static void starcase(int n) {
        // 000# n-1
        // 00## n-2
        // 0### ...
        // #### n-n
        int i, j, k;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for (k = i; k >= 0; k--) {
                System.out.print("#");
            }

            System.out.println();
        }
    }
}