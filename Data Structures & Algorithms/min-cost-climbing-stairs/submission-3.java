class Solution {
    private int[] memo;
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        memo = new int[n + 1];
        Arrays.fill(memo, -1);
        memo[0] = 0;
        memo[1] = 0;
        return minCost(cost, n);
    }
    private int minCost(int[] cost, int i){
        if(memo[i] != -1)
        return memo[i];
        else
        memo[i] = Math.min(cost[i-2] + minCost(cost, i - 2), cost[i-1] + minCost(cost, i - 1));
        return memo[i];
    }
}
