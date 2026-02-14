class Solution {
    public int findDuplicate(int[] nums) {

        int slow = 0;
        int fast = 0;

        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(fast!=slow);
        fast = 0;
        while(fast!=slow){
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}
// fast = 0 | slow = 0
// // [1,3,4,2,2]

// slow = nums[slow] = 1
// fast = nums[nums[fast]] =nums[1] = 3
// __________________________________
// fast = 1 | slow = 3

// slow = nums[3] = 2
// fast = nums[nums[1]] =nums[3] = 2
// __________________________________
// 2
// slow = nums[4] = 2
// fast = nums[nums[4]] =nums[2] = 4
// __________________________________
// 3
// slow = nums[2] = 4
// fast = nums[nums[2]] =nums[4] = 2
// __________________________________
// 4
// slow = nums[2] = 4
// fast = nums[nums[2]] =nums[4] = 2
// __________________________________