class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        int leftIndx = binarySearch(nums,target,"left");
        int rightIndx = binarySearch(nums,target,"right");
        result[0] = leftIndx ;
        result[1] = rightIndx ;
        return result ;
    }

    private int binarySearch(int[] nums, int target , String side){
        int left = 0 ; 
        int right = nums.length - 1;
        int indx = -1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(nums[mid] == target){
                indx = mid ;
                if(side.equals("left")) right = mid - 1;
                else left = mid + 1;
            }
            else if( nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }

        return indx;
    }
}