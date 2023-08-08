class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Arrays.sort(nums);
        int res;
        for(int i=0; i<nums.length; i++){
            res = Arrays.binarySearch(nums, i+1, nums.length, nums[i]);
            if(res > 0) return true;
            
        }
        return false;
    }

   
}