class Solution {
    public int search(int[] nums, int target) {
        
        int low = 0, high = nums.length;
        int mid = (low + high)/2;

        for(int i = 0; i<nums.length; i++){
            if(target == nums[mid]) return mid;
            else if(target < nums[mid]){
                high = mid; 
            } 
            else { //target > nums[mid]
                low = mid;
            }   
            mid = (low + high)/2;
        }
        return -1;
    }
}