class Solution {
    public void nextPermutation(int[] nums) {
        
        // [4,1,2,6,8,2]=>[4,1,2,8,2,6]
        // [3,2,1]=>[1,2,3]
        //[7,3,2,9,0]=[7,3,9,0,2]=>[7,3,9,2,0]=>[7,9,0,2,3]
        //[4,3,2,1]=>[]
        //[1, 3, 5, 4, 2]=> [1,5,2,3,4]

        //find pivot and interchange pivot with smallest among all biggest numebers than pivot in the right and reverse array from pivot+1 to end
        //if not pivot found reverse entire array

        int pivot = -1;
        int n = nums.length;
        for(int i = n-2 ; i>=0 ; i--){
            if(nums[i]<nums[i+1]){
                pivot = i ;
                break;
            }
        }
        System.out.println(pivot);

        if(pivot == -1) reverse(nums,0,n-1);

        else{
            //find swapper with pivot 
            int swapperPos = -1;

            for(int i = n-1; i>=0 ; i--){
                if(nums[i]>nums[pivot]){
                    swapperPos = i;
                    break;
                }
            }

            //swap with swapper
            int temp = nums[pivot];
            nums[pivot] = nums[swapperPos];
            nums[swapperPos] = temp;

            reverse(nums,pivot+1,n-1);

        }





    }

    private static void reverse(int[] nums, int i, int j){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}