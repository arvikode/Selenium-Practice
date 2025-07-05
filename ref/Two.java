import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Two {
    public static void main(String[] args) throws IOException {

        String s = "test12pop90";

        // Pattern Matcher method
        Pattern pat = Pattern.compile("\\d", Pattern.CASE_INSENSITIVE);
        Matcher mat = pat.matcher(s);
        List<String> list = new ArrayList<>();
        while (mat.find()) {
            list.add(mat.group());
            System.out.println(mat.group());
        }
        System.out.println(); // Output: tset12pop90

        System.out.println(0.0/0.0);
    }

    public static String reverseOnlyCharacters(String s1) {


        // String Builder Method
        String s = "test12pop90";
        char[] ch = s.toCharArray();

        StringBuilder builder = new StringBuilder();
        StringBuilder reverser = new StringBuilder();

        for (char c: ch) {
            if (Character.isAlphabetic(c)) {
                reverser.append(c);
            }

            if (Character.isDigit(c)) {
                if (!reverser.isEmpty()) {
                    builder.append(reverser.reverse());
                    reverser.setLength(0);
                }
                builder.append(c);
            }

        }

        System.out.println(builder);

        String result = builder.toString();
        return result.toString();
    }
}
