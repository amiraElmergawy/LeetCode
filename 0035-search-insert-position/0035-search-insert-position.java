class Solution {

     public int search(int[] nums, int target) {
        
        int low = 0, high = nums.length;
        int mid = (low + high)/2;
        int helper;

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
        // return the index where it would be if it were inserted in order
        return nums[mid] > target? -1*(mid): -1*(mid+1);
    }


    public int searchInsert(int[] nums, int target) {
        int index = search(nums, target);
        if(index < 0){  
            index *= -1;
        }
        return index;
    }
}