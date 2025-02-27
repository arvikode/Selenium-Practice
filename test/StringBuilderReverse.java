public class StringBuilderReverse {
    public static void main(String[] args) {
        String str = "Aravind";
        StringBuilder builder = new StringBuilder(str);
        String reversedStr = builder.reverse().toString();
        System.out.println(reversedStr);
    }
}
