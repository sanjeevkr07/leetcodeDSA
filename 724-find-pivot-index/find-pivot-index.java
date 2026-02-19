class Solution {
    public int pivotIndex(int[] nums) {
        int prefix = 0 ;
        
        int sum = 0;
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            sum += nums[i];
        }
        int suffix = sum - nums[0];
        if(prefix == suffix) return 0;

    

        for(int i = 1 ; i < n ; i++){
            prefix += nums[i-1];
            suffix  = sum - prefix - nums[i];
            if(prefix == suffix) return i;
    
        }
        
        return -1;
    }
}