class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int left  = 0;
        int right = 0;
        int n = nums.length;

        int minLen = Integer.MAX_VALUE;
        int windowSum = 0;

        if( windowSum == target ) return 1;
        
        while(right < n){
            
            windowSum += nums[right];

            

            while( windowSum >= target ){
                    minLen = Math.min(right - left +1 , minLen);
                    windowSum -= nums[left++];

            }
        
            
            right++;
        }

        return minLen<Integer.MAX_VALUE? minLen:0;
    }

}