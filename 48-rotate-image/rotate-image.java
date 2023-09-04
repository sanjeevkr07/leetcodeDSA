class Solution {

    public void reverse(int[] mat){
        int i=0;
        int j=mat.length-1;

        while(i<j){
            int temp=mat[i];
            mat[i]=mat[j];
            mat[j]=temp;
            i++;
            j--;
        }

    }
    public void rotate(int[][] matrix) {

      
        int n=matrix.length;

       int temp;
      for(int i=0;i<n-1;i++){
          
    
          for(int j=i+1;j<n;j++){
              temp=matrix[i][j];
              matrix[i][j]=matrix[j][i];
              matrix[j][i]=temp;
             
          }
          
      }

      for(int i=0;i<n;i++){
          reverse(matrix[i]);
      }
        
    }
}