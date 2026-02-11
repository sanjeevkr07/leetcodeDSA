class Solution {
    public int threeSumClosest(int[] nums, int target) {

        int closest = Integer.MAX_VALUE;
        int resultSum = 0;

        //[-4,-1,1,2]
        // x+y = k-nums[i];
        // 2-> 
        // -2,-3,1,0,-1,2,
        // 4,5,1,2,3,0
        // -2->
        // 0,1,3,2,1,4

        // closest = Math.min(closestNum,Math.abs(target-closest));
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0 ; i < n-2 ; i++){
            int left = i+1;
            int right = n-1;

            while(left<right){
                int sum  = nums[left]+nums[right]+nums[i];
                if(sum == target) return sum;

                int diff = Math.abs(target-sum);
                // System.out.println("for:"+nums[i]+" "+nums[left]+" "+nums[right]);
                // System.out.println("sum:"+sum + " Target:"+target + " diff:"+diff);
                if(diff<closest){
                    closest = diff;
                    resultSum = sum;
                }

                else if(sum < target)  left++;
                else right--;
            }
        }

        return resultSum;
        
    }
}