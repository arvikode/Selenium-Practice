import java.util.Arrays;

public class one {
    public static void main(String[] args){
        String str = "abc \"efg ijk\"";
        String removeBackSlash = str.replace("\"", "");
        System.out.println(removeBackSlash);

        String[] strArray = removeBackSlash.split(" ");
        System.out.println(Arrays.toString(strArray));
        System.out.println("test");

    }
}
