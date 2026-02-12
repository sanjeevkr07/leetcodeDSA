class Solution {
    public int totalFruit(int[] fruits) {
        
        int n = fruits.length;

        if( n<=2 ) return n;

        

        HashMap<Integer,Integer> map = new HashMap<>();

        int left = 0;
        
        int maxLen = 0;

        for(int right = 0 ; right< n ; right++){
            
            int fruit = fruits[right];
            map.put(fruit,map.getOrDefault(fruit,0)+1);

            while(map.size()>2){
                int leftFruit = fruits[left];
                map.put(leftFruit,map.get(leftFruit)-1);

                if(map.get(leftFruit) == 0) map.remove(leftFruit);

                left++;
            }

            if(map.size() <= 2) maxLen = Math.max(maxLen,right-left+1);
        }

        return maxLen;
    }
}