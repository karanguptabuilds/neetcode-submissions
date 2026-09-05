class Solution:
    def rob(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return nums[0]
        if len(nums) == 2:
            return max(nums[0], nums[1])

        n = len(nums)
        dp = [0] * n

        # Case 1: skip the last house
        dp[0] = nums[0]
        dp[1] = max(nums[0], nums[1])
        for i in range(2, n - 1):
            dp[i] = max(nums[i] + dp[i - 2], dp[i - 1])
        res1 = dp[n- 2]

        # Case 2: skip the first house
        dp[1] = nums[1]
        dp[2] = max(nums[1], nums[2])
        for i in range(3,n):
            dp[i] = max(nums[i] + dp[i-2], dp[i-1])
        res2 = dp[n - 1]

        return max(res1, res2)
