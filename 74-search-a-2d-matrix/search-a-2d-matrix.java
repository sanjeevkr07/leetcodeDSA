class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int left = 0 ;
        int m = matrix.length;
        int n = matrix[0].length;
        int right = (m*n) - 1;
        int i = 0 ;
        int j = 0;
        while(left <= right){
            int mid = left + (right-left)/2 ;

            i = mid/n;
            j = mid%n;
            // System.out.println(i+" "+j);
            if(matrix[i][j]== target) return true;
            else if(matrix[i][j] > target) right = mid - 1 ;
            else left = mid + 1;
        }
        
        return false;
    }
}