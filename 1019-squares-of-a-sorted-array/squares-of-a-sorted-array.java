class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n-1;
        int k = n-1;

        while(left<=right){
            int leftSqr = nums[left]*nums[left];
            int rightSqr = nums[right]*nums[right];

            if(leftSqr > rightSqr){
                result[k--] = leftSqr;
                left++;
            }
            else {
                result[k--] = rightSqr;
                right--;
            }
        }
        
        return result;
    }
}