class Solution {
    public boolean increasingTriplet(int[] nums) {
        int i = Integer.MAX_VALUE;
        int j = Integer.MAX_VALUE;

        for (int k = 0; k < nums.length; k++) {

            if (j < nums[k])
                return true;

            if (i >= nums[k])
                i = nums[k];
            else
                j = nums[k];
        }

        return false;
    }
}