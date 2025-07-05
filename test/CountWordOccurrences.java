import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWordOccurrences {
    public static void main(String[] args) {
        // Get the user input
       Scanner myScanner = new Scanner(System.in);
       System.out.println("Type the sentence below...");

       String sentence = myScanner.nextLine();

       System.out.println("The entered text is: " + sentence);

       // Make everything lower case so that we don't repeat words that are in both upper case and lower case
       String transforedSentence = sentence.toLowerCase();

       // Split the string using a delimiter and store it in a String Array
        String[] words = transforedSentence.split("\\s");

        System.out.println("The string of words are " + Arrays.toString(words));

        // Use this map as a container
        Map<String, Integer> map = new HashMap<>();

        // Use the for each loop to insert the
        for (String word: words) {
            map.put(word, map.getOrDefault(word, 0)+1);
        }

        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey()+ " -> " + entry.getValue() + " times");
        }
    }
}
