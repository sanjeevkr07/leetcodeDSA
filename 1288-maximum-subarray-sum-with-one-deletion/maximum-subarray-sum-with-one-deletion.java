class Solution {
    public int maximumSum(int[] arr) {
       int noDelete = arr[0];
       int oneDelete = Integer.MIN_VALUE;
       int maxi = arr[0];

       for(int i = 1 ; i < arr.length ; i++){
            int prevNoDelete = noDelete;

            noDelete = Math.max(noDelete + arr[i] , arr[i]);

            int temp = 0;
            if(oneDelete == Integer.MIN_VALUE) temp = arr[i];
            else temp = oneDelete + arr[i] ;
            oneDelete = Math.max(temp , prevNoDelete);



            maxi = Math.max(maxi,Math.max(noDelete,oneDelete));

       }

       return maxi;

    }
}