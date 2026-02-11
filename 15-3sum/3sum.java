class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //[-4,-1,-1,0,1,2]
        // a[i]+x+y=0
        // x+y=-a[i]
        // [0,0,0,0]
    

        Arrays.sort(nums);
        int n = nums.length;

        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<n-2;i++){
            if(i>0 && nums[i-1]==nums[i]) continue;
            int k = -1*nums[i];
            // System.out.println("checking for sum:"+k);
            int left = i+1;
            int right = n-1;
            while(left<right){
                if(nums[left]+nums[right]==k){
                    result.add(List.of(-1*k,nums[left++],nums[right--]));
                    // System.out.println("sum:"+k);
                    while(left<n && nums[left]==nums[left-1]) left++;
                    while(right>=0 && nums[right]==nums[right+1]) right--;
                }
                else if(nums[left]+nums[right]>k) right--;
                else left++;
            }
        }
        return result;
    }
}