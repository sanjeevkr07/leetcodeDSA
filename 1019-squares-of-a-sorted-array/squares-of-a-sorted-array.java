class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int foldingPoint = -1;
        //[0,2,3,4,5]

        for(int i = 0; i < n; i++){
            if(nums[i]>=0 && foldingPoint<0) foldingPoint = i;
            nums[i]=nums[i]*nums[i];
        }
        // System.out.println(foldingPoint);

        if(foldingPoint==-1) foldingPoint=n-1;

        int i = foldingPoint-1;
        int j = foldingPoint;
        int k = 0;

        while(i>=0 && j<n){
            if(nums[i]<nums[j])
                result[k++] = nums[i--];
            else
                result[k++] = nums[j++];

        }

        while(j<n) result[k++] = nums[j++];
        while(i>=0) result[k++] = nums[i--];

        return result;
        
    }
}