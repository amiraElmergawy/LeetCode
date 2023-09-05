class Solution {
    public boolean isPalindrome(int x) {
        
        if(x < 0) return false;
        if(x < 10) return true;
        int right, left;
        int rightRemainder = x;
        int leftRemainder = x;
        //Math.log10(n)+1
        int leftRemainderSize = (int)Math.log10(leftRemainder)+1;
        final int size = leftRemainderSize/2;
        while(leftRemainderSize != size){
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