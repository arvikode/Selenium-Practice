import java.util.Arrays;

public class ReverseAString {
    // reverse a string input - "Aravind" out - reverse

    public static void main(String[] args){
        String str = "aravind";
        String rev = "";
        char[] ch = str.toCharArray();
        int len = ch.length;

        char[] reversedCh = new char[len];
        int index = 0;

        for (int i = len-1; i >= 0; i--){
            // need a container to store values
            reversedCh[index] = ch[i];
            index++;

           rev += str.charAt(i); // another way does't pertain to the code before
        }

        System.out.println("Actual String: "+ str + "Reversed String: " + Arrays.toString(reversedCh));

        System.out.println(rev);
    }


}
