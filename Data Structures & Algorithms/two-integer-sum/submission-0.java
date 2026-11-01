class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> sum = new HashMap<>();
        for(int i =0; i < nums.length ; i++){
            int remaining  = target - nums[i];
            if(sum.containsKey(remaining)){
                return new int[]{ sum.get(remaining), i};
            }
            sum.put(nums[i], i);
        }
        return new int[] {};
    }
}