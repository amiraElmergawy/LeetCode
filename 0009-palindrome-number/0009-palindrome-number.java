class Solution {
    public boolean isPalindrome(int x) {
        
        int right, left;
        int rightRemainder = x;
        int leftRemainder = x;
        
        int leftRemainderSize = String.valueOf(Math.abs(leftRemainder)).length();
        if(x < 0) return false;
        while(leftRemainderSize != 0){
              right = rightRemainder % 10;
              rightRemainder = rightRemainder / 10;
              left = (int)(leftRemainder / Math.pow(10, leftRemainderSize-1));
              leftRemainder = (int)(leftRemainder % Math.pow(10,leftRemainderSize-1));
              if(left != right) return false;
              leftRemainderSize --;
            
        }
        
        return true;
        
    }
}