class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;

        HashMap<Integer,Integer> prefixMap = new HashMap<>();
        int sum = 0;
        prefixMap.put(0,1);
        int count = 0;


        for(int i = 0 ; i < n ; i++){
            sum += nums[i];
            if(prefixMap.containsKey(sum-k)){
                count +=prefixMap.get(sum-k);
            }
            prefixMap.put(sum,prefixMap.getOrDefault(sum,0)+1);
        }
        

        return count;

    }
}

// [1,-2,-2,2,1,3,1,3] k= 2

// []

// [0,1,-1,-3,-1,0,3,4]
// [6,8,10, 8, 7,4,3,0]