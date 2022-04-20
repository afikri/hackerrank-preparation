import java.util.*;;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        // String s = scan.next();
        // String b = scan.next();
        // String s = "He is a very very good boy, isn't he?";
        scan.close();
        Solution.solution(s);
    }

    static void solution(String s) {
        // Input
        // s is composed of any of the following:
        // - English alphabetic letters,
        // - blank spaces,
        // - exclamation points (!),
        // - commas (,),
        // - question marks (?),
        // - periods (.),
        // - underscores (_),
        // - apostrophes ('),
        // - and at symbols (@).

        s=s.trim();
        String[] splitted = s.split("[!,?._'@\\ ]+");

        if (s.length() == 0 || s == null)
            System.out.println(0);
        else {
            System.out.println(splitted.length);

            for (int i = 0; i < splitted.length; i++) {
                System.out.println(splitted[i]);
            }

        }

    }
}