class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int[] temp = sum(weights);
        int left = temp[0];
        int right = temp[1];

        while(left < right){
            int mid = left + (right - left)/2;

            if(isPossible(weights,days,mid)) right = mid;
            else left = mid+1;
        }
        // System.out.println(isPossible(weights,days,9));

        return left;
    }
    private boolean isPossible(int[] weights,int days,int capacity){
    int daysCount = 1;
    int currentLoad = 0;

    for (int w : weights) {
        if(daysCount > days) return false;

        if (currentLoad + w > capacity) {
            daysCount++;
            currentLoad = 0;
        }

        currentLoad += w;
    }

    return daysCount <= days;
    }

    private int[] sum(int[] weights){
        int total = 0;
        int maximum = 0 ; 
        for(int i: weights){
            total+=i;
            maximum = Math.max(maximum,i);
        }

        return new int[] {maximum,total} ; 
    }
}

// 1 2 3 4 5 6 7 8