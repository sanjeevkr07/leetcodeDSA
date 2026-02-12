class Solution {
    public int trap(int[] height) {

        int maxLeft = height[0];
        int maxRight = height[height.length - 1];

        int left = 0;
        int right = height.length - 1;
         
        int result = 0 ;

        while(left <= right){
            int temp = 0;
            if(maxLeft <= maxRight){
                
                temp = maxLeft - height[left];
                maxLeft = Math.max(maxLeft,height[left++]);
            }
            else{

                temp = maxRight - height[right];
                maxRight = Math.max(maxRight,height[right--]);

            }
            if(temp > 0) result += temp;

        }

        return result;
    }
}