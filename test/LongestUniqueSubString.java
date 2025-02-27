import java.util.HashMap;
import java.util.HashSet;

public class LongestUniqueSubString {
    public static void main(String[] args) {
        String str = "abccba";
        char[] ch = str.toCharArray();
        int len = str.length();
        HashSet<Character> set = new HashSet<>();

        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < len; right++) {

            if (set.contains(ch[right])){
                set.remove(ch[left]);
                left++;
            }

            set.add(ch[right]);
            maxLength = Math.max(maxLength, right-left+1);
        }

        String longestNonRepeatingSubstring = str.substring(left, left+maxLength);
        System.out.println(longestNonRepeatingSubstring);

    }
}
