class Solution {
    public int[] productExceptSelf(int[] nums) {
        // optimal solution for it to create a result array first
        // this should basically contain all the prefixes with respect to the nums
        // then optimise it with using postfixes

        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1; // for the first no. no prefix so multiply by 1 itself
        for(int i = 1; i < n; i++){
            res[i] = res[i - 1] * nums[i - 1]; // solves for the prefix for sure
        }
        // for the postfix: need to figure out a fix for sure 
        int suffix = 1;
        for(int i = n - 1; i >= 0; i--){
            res[i] *= suffix;
            suffix *= nums[i];
        }
        return res;

        
    }
}  
