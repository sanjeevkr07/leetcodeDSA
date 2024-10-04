class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        for(int i = 0 ;i<n;i++){
                nums[i]=nums[i]*nums[i];
        }

        int[] result = new int[n];
        int i=0;
        int j=n-1;

        while(i<=j){
            if(nums[i]>nums[j]){
                result[n-1]=nums[i];
                i++;
            }
            else{
                result[n-1]=nums[j];
                j--;
            }
             n--;   
        }



     
        return result;
    }
}
