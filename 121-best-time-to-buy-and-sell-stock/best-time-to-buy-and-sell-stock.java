class Solution {
    public int maxProfit(int[] prices) {
        int minNum=Integer.MAX_VALUE;
        int maxDiff=Integer.MIN_VALUE;

        for(int n:prices){
            minNum=Math.min(n,minNum);
            maxDiff=Math.max(maxDiff,(n-minNum));
        }

        return maxDiff;
    }
}