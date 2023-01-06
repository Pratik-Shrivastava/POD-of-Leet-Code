// Here is the link to my solution on leet code.
// https://leetcode.com/problems/maximum-ice-cream-bars/solutions/3007614/simple-java-sorting-easy-to-understand/
import java.util.Arrays;

public class Maximum_Ice_Cream_Bars {
    public static void main(String[] args) {

        int [] cost = {1,3,2,4,1};
        int coin = 7;

        System.out.println(maxIceCream(cost, coin));
    }
    static int maxIceCream(int[] costs, int coins) {

        // naive approach
        // sort the array and find the maximum number of ice-creams.

        Arrays.sort(costs);
        int maxIceCream = 0;
        int sum = 0;

        for(int i = 0; i < costs.length; i++)
        {
            sum += costs[i];
            if(sum > coins)
            {
                return maxIceCream;
            }
            maxIceCream++;
        }
        return maxIceCream;





    }
}