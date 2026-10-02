class Solution {
    public int[] twoSum(int[] nums, int target) {
        // create a hashmap: key == number,value == index
        Map<Integer, Integer> res = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int left = target - nums[i];
            if(res.containsKey(left)){
                return new int[]{res.get(left), i};
            }
            res.put(nums[i], i);
        }
        return new int[]{};
    }
}
