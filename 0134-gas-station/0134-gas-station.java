class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0, totalCost = 0;
        int currentGas = 0, start = 0;

        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            currentGas += gas[i] - cost[i];

            // If currentGas is negative, reset start index to i + 1
            if (currentGas < 0) {
                start = i + 1;
                currentGas = 0;
            }
        }

        // Check if there is enough gas to cover the total cost
        return totalGas >= totalCost ? start : -1;
    }
}