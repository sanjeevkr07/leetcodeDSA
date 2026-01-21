class Solution {
    public int findDuplicate(int[] nums) {

        int slow = 0;
        int fast = 0;
        int n = nums.length;

        do{
            // System.out.println("Before: slow: "+slow+" fast: "+fast);
            slow = nums[slow];
            fast = nums[nums[fast]];
            // System.out.println("After: slow: "+slow+" fast: "+fast);
        }while(slow!=fast);

        slow =0;

        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }

        return slow;
        
    }
}