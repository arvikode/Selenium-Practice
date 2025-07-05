import java.util.HashSet;
import java.util.Set;

public class Three {
    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CDEF";

        // Find nunommon characters between the 2 strings

        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        Set<Character> common = new HashSet<>();

        for (char c: str1.toCharArray()) {
            set1.add(c);
        }
        for (char c: str2.toCharArray()) {
            if (set1.contains(c)) {
                common.add(c);
            }
            set2.add(c);
        }

        Set<Character> resultSet = new HashSet<>(set1);
        System.out.println(resultSet + " just set 1");
        resultSet.addAll(set2);
        System.out.println(resultSet + " just set 1 + set 2");
        resultSet.removeAll(common);
        System.out.println(resultSet + " after remove common");

    }
}
