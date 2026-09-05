class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1)
        return nums[0];
        if (nums.length == 2)
        return Math.max(nums[0], nums[1]);

        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 0);

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i  = 2; i <= n - 2; i++){
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        int res1 = dp[n - 2];

        dp[1] = nums[1];
        dp[2] = Math.max(nums[1], nums[2]);
        for(int i = 3; i < n; i++){
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        int res2 = dp[n - 1];

        return Math.max(res1, res2);

    }
}
