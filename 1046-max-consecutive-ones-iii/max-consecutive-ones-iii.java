class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int left = 0 ;
        int n = nums.length;
        int freqOfZero = 0;
        int maxLen = 0;

        for(int right = 0 ; right < n ; right++){
            if( nums[right] ==  0) freqOfZero++;

            while(freqOfZero > k){
                if(nums[left] == 0) freqOfZero--;
                left++;
            }

            maxLen = Math.max(maxLen, right-left+1);
            
        }

        return maxLen;
    }
}