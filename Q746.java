class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int[] nCost = new int[len];
        nCost[0] = cost[0];
        nCost[1] = cost[1];
        for(int i = 2;i < len; i++){
            nCost[i] = Math.min(nCost[i-1],nCost[i-2]) + cost[i];
        }
        // T(n)  = Min(T(n-1),T(n-2)) + S(n)
        return Math.min(nCost[len-1],nCost[len-2]);
    }
}
