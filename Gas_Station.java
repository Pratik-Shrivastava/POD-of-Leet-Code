public class Gas_Station {
    public static void main(String[] args) {

        int [] gas = {5,8,2,8};
        int [] cost = {6,5,6,6};
        System.out.println(canCompleteCircuit(gas, cost));


    }
    static int canCompleteCircuit(int[] gas, int[] cost)
    {
        //Calculate the total gas and total costs.
        //If cost > gas then it is impossible to complete the cycle.

        int i;
        int totalGas = 0;
        int totalCost = 0;

        for(i = 0; i < gas.length; i++)
        {
            totalGas += gas[i];
            totalCost += cost[i];
        }

        if(totalCost > totalGas) return -1;

        int currentGas = 0;
        int start = 0;

        // We will check for each index, if at any index
        // the gas in tank is empty, then return -1.

        for(i = 0; i < gas.length; i++)
        {
            currentGas += gas[i] - cost[i];

            if(currentGas < 0)
            {
                currentGas = 0;
                start = i+1;
            }
        }

        //Finally, return start;
        return start;

    }
}