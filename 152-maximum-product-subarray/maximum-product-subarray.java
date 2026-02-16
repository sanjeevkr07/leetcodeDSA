class Solution {
    public int maxProduct(int[] nums) {
        int maxProdEnding = nums[0];
        int maxi = nums[0];
        int minProdEnding = nums[0];

        for(int i = 1 ; i < nums.length ; i++){

            int poss1 = nums[i];
            int poss2 = maxProdEnding * nums[i];
            int poss3 = minProdEnding * nums[i];

            maxProdEnding = Math.max(poss1,Math.max(poss2,poss3));

            minProdEnding = Math.min(poss1,Math.min(poss2,poss3));;
            
            maxi = Math.max(maxProdEnding , maxi);
        }

        return maxi ;
    }
}

// [2,3,-2,4] max =6

// i =1
// 6 | 3 => 6
// i =2
// -12 | -2 => -2
// i = 3
// -8 | 4 => 4



