class Solution {
    public int maxAbsoluteSum(int[] nums) {

        // if(num.)

        int maxEnding = nums[0];
        int minEnding = nums[0];
        int maxi = Math.abs(nums[0]);

        for(int i = 1 ; i < nums.length ; i++){

            maxEnding = Math.max(maxEnding + nums[i] , nums[i]);
            minEnding = Math.min(minEnding + nums[i] , nums[i]);

            maxi = Math.max(maxi,Math.max(maxEnding, Math.abs(minEnding)));
        }
        
        return maxi;
    }
}

