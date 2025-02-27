import java.util.HashSet;

public class TwoSum {
    public static void main(String[] main) {
        // Two sum using sets
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int target = 8;

        int len = arr.length;

        HashSet<Integer> set = new HashSet<>();

        for (int element: arr) {
            int complement = target-element;
            if (set.contains(complement)){
                System.out.println(complement + ","+ element);
            }
            set.add(element);
        }
    }
}
