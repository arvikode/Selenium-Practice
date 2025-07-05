import java.util.Arrays;

public class MergingTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};

        // Create an array that can hold both arr1 and arr2
        int[] arrMerge = new int[arr1.length+arr2.length];

        System.out.println(arrMerge.length);

        System.arraycopy(arr1, 0, arrMerge, 0, arr1.length);
        System.arraycopy(arr2, 0, arrMerge, arr1.length, arr2.length);

        System.out.println(Arrays.toString(arrMerge));
    }
}
