class Solution {
    public void reverse(int[] nums,int a,int b){
        while(a<b){
            //swap(nums[a],nums[b]);
            int temp=nums[a];
            nums[a]=nums[b];
            nums[b]=temp;
            a++;
            b--;
        }
    }
    public void nextPermutation(int[] nums) {

        int ind=-1;
        int n=nums.length;
        //find thr break point

        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            reverse(nums,0,n-1);
        }
        else{
            for(int i=n-1;i>ind;i--){
                if(nums[ind]<nums[i]){
                    //swap(nums[ind],nums[i]);
                    int temp=nums[ind];
                    nums[ind]=nums[i];
                    nums[i]=temp;
                    break;
                }
            }

            reverse(nums,ind+1,n-1);
        }


        
    }
}