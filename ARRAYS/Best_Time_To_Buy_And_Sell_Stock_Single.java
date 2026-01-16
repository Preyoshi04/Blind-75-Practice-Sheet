import java.util.*;

public class Best_Time_To_Buy_And_Sell_Stock_Single {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elemetns of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The maximum profit made can be:" + maxProfit(arr));
        sc.close();
    }
    public static int maxProfit(int[] prices) {
        int costPrice = prices[0];
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++)
        {
            if(costPrice > prices[i])
            {
                costPrice = prices[i];
            }
            int profit = prices[i] - costPrice;
            maxProfit = Math.max(maxProfit , profit);
        }
        return maxProfit;
    }
}
