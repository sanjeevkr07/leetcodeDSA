class Solution {
    public int maxSubArray(int[] nums) {

        int maxTillNow = nums[0];
        int maxi = nums[0];

        for(int i = 1 ; i < nums.length ; i++){
            maxTillNow = Math.max(nums[i]+maxTillNow,nums[i]);
            maxi = Math.max(maxi,maxTillNow);
        }

        return maxi;
        
    }
}