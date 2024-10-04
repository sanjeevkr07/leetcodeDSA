class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0 ;i<nums.length;i++){
                nums[i]=nums[i]*nums[i];
        }

        TreeMap<Integer,Integer> mp = new TreeMap<>();


        for(int i :nums){
            if(mp.containsKey(i)){
                mp.put(i,mp.get(i)+1);
            }
            else
                mp.put(i,1);
        }

        int[] result = new int[nums.length];
        int r=0;
        for(int key: mp.keySet()){ //{4=1, 9=2, 49=1, 121=1}
            int count=mp.get(key);//1
            while(count>0){
                result[r++]=key;
                count--;
            }
        }

        return result;
    }
}
