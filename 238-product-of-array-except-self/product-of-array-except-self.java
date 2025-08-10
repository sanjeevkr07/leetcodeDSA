class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        int[] suff = new int[n];
        pre[0] = 1;
        //result[1] = nums[0];
        //prefix
        for(int i=1;i<n;i++)
            pre[i]=nums[i-1]*pre[i-1];

        //suffix
        suff[n-1] = 1;
        for(int i=n-2;i>=0;i--)
            suff[i]=suff[i+1]*nums[i+1];

        //product
        for(int i=0;i<n;i++)
            suff[i]=suff[i]*pre[i];

        return suff;
    }
}