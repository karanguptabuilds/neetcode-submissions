class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        n = len(nums)
        leftProduct = 1
        rightProduct = 1
        res = nums[0]

        for i in range(n):
            leftProduct = 1 if leftProduct == 0 else leftProduct
            rightProduct = 1 if rightProduct == 0 else rightProduct

            leftProduct *= nums[i]
            rightProduct *= nums[n - i - 1]

            res = max(res, max(leftProduct, rightProduct))
        
        return res
