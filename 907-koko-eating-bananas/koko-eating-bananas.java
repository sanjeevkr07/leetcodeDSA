class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = findMax(piles);

        while(left < right){
            int mid = left + (right-left)/2;
            if(isPossible(piles,h,mid)) right = mid;
            else left = mid+1;
        }
        return left;
    }

    private boolean isPossible(int[] piles, int h, int k){
        int totalHours = 0 ;
        for(int i = 0 ; i < piles.length ; i++){
            totalHours += (piles[i] + k - 1) / k;
        }
        
        return totalHours <= h;
    }

    private int findMax(int[] piles){
        int maxi = Integer.MIN_VALUE;
        for(int i: piles){
            maxi = Math.max(maxi,i);
        }

        return maxi;
    }
}