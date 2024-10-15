class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int result = -1;

        for(int i=0;i<gas.length;i++){
            if(gas[i]>cost[i]){
                result = findPath(gas, cost, i);
                if(result>-1) return result;
            }
        }
        if(gas.length==1 && gas[0]==cost[0]){
            return 0;
        }

        return -1;
    }

    public int findPath(int[] gas, int[] cost, int i){
        int totalGas = gas[i];
        int totalCost = cost[i];
        int tank = totalGas;
        int j = (i+1) % gas.length;
        while(j!=i && tank>=totalCost){
            
            tank = tank - totalCost + gas[j];
            totalCost = cost[j];
            j = (j+1)%gas.length;
        }

        return j==i && tank>=totalCost? i : -1;
    }
}