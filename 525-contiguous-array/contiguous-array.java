class Solution {
    public int findMaxLength(int[] nums) {
        if (nums.length == 1) return 0;
        HashMap<Integer,Integer> map =new HashMap<>();
        int sum = 0 ;
        map.put(0,-1);
        int maxLength = 0;
        for(int i = 0 ; i < nums.length ; i++){
            // System.out.println(map);
            sum = nums[i] == 0 ? sum - 1 : sum + 1;
            // System.out.println(sum);
            if(map.containsKey(sum)){
                maxLength = Math.max(maxLength, i - map.get(sum));
                // System.out.println("maxLength:" + maxLength);
            }
            else map.put(sum, i);
        }
        
        return maxLength ; 
    }
}

