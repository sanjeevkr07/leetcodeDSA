class Solution {
    public int subarraysDivByK(int[] nums, int k) {


        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int result = 0;
        int sum = 0;
        for(int i =0 ; i < nums.length ; i++){
            sum += nums[i];
            int temp = sum % k;
            if (temp < 0) temp += k;
            if(map.containsKey(temp)){
                result +=map.get(temp);
            }

            map.put(temp,map.getOrDefault(temp,0)+1);

        }
        return result;
    }
}