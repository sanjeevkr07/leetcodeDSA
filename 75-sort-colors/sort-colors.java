class Solution {
    public void sortColors(int[] nums) {
        int l=0;
        int m=0;
        int h=nums.length-1;
        


        while(m<=h){
            int temp=0;
            switch(nums[m]){
                case 0:
                    temp=nums[m];
                    nums[m]=nums[l];
                    nums[l]=temp;
                    m++;
                    l++;
                    break;
                case 1:
                    m++;
                    break;
                
                case 2:
                    temp=nums[m];
                    nums[m]=nums[h];
                    nums[h]=temp;
                    h--;
                    break;

                    
            }
        }
    }
}