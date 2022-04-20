import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        boolean ret = Solution.isAnagram("banaNa", "nanaba");
        System.out.println(ret ? "Anagram" : "Not Anagram");
    }

    public static boolean isAnagram(String a, String b) {
        String str1 = a; // banana
        String str2 = b; // nanaba

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] charStr1 = str1.toCharArray();
        char[] charStr2 = str2.toCharArray();

        if (str1.length() == str2.length()) {
            Arrays.sort(charStr1);
            Arrays.sort(charStr2);
            boolean res = Arrays.equals(charStr1, charStr2);
            return res;
        }
        return false;
    }

}