import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        // Find the first non-repeating character in the String
        String str1 = new String("Software Testing");

        char[] ch = str1.toLowerCase().toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

        for (char c: ch) {
            if (c != '\s') {
                map.put(c, map.getOrDefault(c, 0)+1);
            }
        }

        for (Map.Entry<Character, Integer> entry: map.entrySet()){
            if (entry.getValue() == 1) {
                System.out.println("The non repating first character is: " + entry.getKey());
                break;
            }
        }
        System.out.println(map);

    }
}
