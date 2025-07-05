import java.util.HashMap;
import java.util.Map;

public class Four {
    // input = Automaiton
    // output should be a 1 u 1 somthing like this

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price: prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price-minPrice);
            }
        }

        System.out.println(maxProfit);
    }
}

