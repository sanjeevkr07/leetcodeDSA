class Solution {
    public int maxProfit(int[] prices) {
        int minNum= Integer.MAX_VALUE;
        int maxDiff=Integer.MIN_VALUE;


        for(int i:prices){
            minNum=Math.min(minNum,i);
            maxDiff=Math.max(maxDiff,i-minNum);
        }
        
        return maxDiff;
    }
}