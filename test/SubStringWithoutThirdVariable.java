public class SubStringWithoutThirdVariable {
    public static void main(String[] args) {
        String s1 = "Aravind";
        String s2 = "Karuppusamy";

        s1 = s1+s2;

        System.out.println("This is S1 now: " + 1);

        s2 = s1.substring(0, s1.length()-s2.length()); // now s2 will be equal to "Aravind"

        // s1 will start substring from index s2.length() which is the lenght of "Aravind"
        s1 = s1.substring(s2.length()); // now s1 is "Karuppusamy"

        System.out.println("String S1 is: " + s1 + "String s2 is: " + s2);
    }
}
