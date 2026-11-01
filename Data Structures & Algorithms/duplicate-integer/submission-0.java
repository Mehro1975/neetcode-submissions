class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> count = new HashSet<>();
        for(int i =0; i < nums.length; i++){
            if(count.contains(nums[i])){
                return true;
            }
            count.add(nums[i]);
        }
        return false;

    }
}