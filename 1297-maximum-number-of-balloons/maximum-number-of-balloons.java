class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer>  mp = new HashMap<>();

        for(char c:text.toCharArray()){
            if(c == 'b' || c == 'a' || c == 'l' || c == 'o' || c == 'n' )
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        if(mp.size() != 5) return 0;
        int minCount = Integer.MAX_VALUE;
        for(char c: mp.keySet()){
            if(c == 'l' || c =='o'){
                mp.put(c,mp.get(c)/2);
            }
            minCount = Math.min(minCount,mp.get(c));
        }
        
        return minCount ;
    }
}