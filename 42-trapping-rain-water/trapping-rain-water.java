class Solution {
    public int trap(int[] height) {

        int n = height.length;
        int[] maxLeftArr = new int[n];
        int[] maxRightArr = new int[n];
        int maxLeft = 0;
        int maxRight = 0;
        
        for(int i = 0 ; i < n ; i++){
            maxLeftArr[i] = maxLeft;
            maxLeft = Math.max(maxLeft,height[i]);
        }

        for(int i = n-1 ; i >= 0 ; i--){
            maxRightArr[i] = maxRight;
            maxRight = Math.max(maxRight,height[i]);
        }
        int result = 0;
        for(int i = 0 ; i<n ; i++){
            int temp  = Math.min(maxLeftArr[i],maxRightArr[i]) - height[i];
            if(temp>0) result += temp;
        }

        return result;
        
    }
}