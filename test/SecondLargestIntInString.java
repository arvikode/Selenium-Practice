import java.util.HashSet;
import java.util.Set;

public class SecondLargestIntInString {
    public static void main(String[] args) {
        String str = "nomans4989tale";

        int len = str.length();
        char[] ch = str.toCharArray();
        int firstLI = Integer.MIN_VALUE, secondLI = Integer.MIN_VALUE;

        Set<Integer> set = new HashSet<>();

        for (char c: ch) {

            if (Character.isDigit(c)) {
                int digit = c - '0'; // or you can use int di = Character.getNumericValue(c);

                if (digit > firstLI && !set.contains(digit)) {
                    secondLI = firstLI;
                    firstLI = digit;
                } else if (digit > secondLI && !set.contains(digit)) {
                    secondLI = digit;
                }
                set.add(digit);
            }
        }

        System.out.println("First Largest Integer: " + firstLI + " Second Largest Integer: " + secondLI);
    }
}
