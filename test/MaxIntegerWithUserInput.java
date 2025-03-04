import java.util.Arrays;
import java.util.Scanner;

public class MaxIntegerWithUserInput {
    public static void main(String[] args){
        int max = 0;
        // User Scanner to get the values
        Scanner myScanner = new Scanner(System.in);
        // Get the number of values that the user wants to input
        System.out.println("Enter the number of elements");
        int n = myScanner.nextInt();
        int[] arr = new int[n];

        // Get all the array values 1 by 1
        for (int i=0; i < n; i++) {
            arr[i] = myScanner.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        // Find the greatest element
        for(int element: arr){
            if (element > max){
                max = element;
            }
        }
        System.out.println(max);
    }
}
