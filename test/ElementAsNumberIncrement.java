import java.util.Arrays;

public class ElementAsNumberIncrement {
    /*
     Increment a Number Represented as an Array:
Consider an array like [1, 2, 9], which represents the number 129. When you add one, the result should be [1, 3, 0].
Similarly, [9, 9, 9] should become [1, 0, 0, 0].
    * */
    public static void main(String[] args) {
        int[] arr = {9,9,9};
        int add = 1;

        int[] finalArray = increment(arr, add);
        System.out.println(Arrays.toString(finalArray));
    }

    public static int[] increment(int[] arr, int add) {
        int len = arr.length;

        for (int i = len-1; i >= 0; i--) {
            arr[i]++;
            if (arr[i] < 10) {
                return arr;
            }
            arr[i] = 0;
        }

        int[] newArray = new int[len + 1];
        newArray[0] = 1;
        return newArray;
    }
}
