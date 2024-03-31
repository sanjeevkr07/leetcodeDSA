class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m=triangle.size();
        int n=triangle.get(m-1).size();
        
        int[][] dp=new int[m][n];
        Arrays.stream(dp).forEach(d->Arrays.fill(d,-1));

        for(int i=0;i<n;i++){
            dp[m-1][i]=triangle.get(m-1).get(i);
        }
        
        return findTotal(triangle,0,0,m-1,n-1,dp);
       
    }

    public int findTotal(List<List<Integer>> triangle,int m,int n,int targetm,int targetn,int[][] dp){
        
        for(int i=targetm-1;i>=0;i--){
            for(int j=i;j>=0;j--){
                
                
                
                    int left=dp[i+1][j]+triangle.get(i).get(j);
                
                    int right=dp[i+1][j+1]+triangle.get(i).get(j);
            
                    
               

                
                dp[i][j]=Math.min(left,right);
            }
        }
        // for(int i=0;i<=targetm;i++){
        //     for(int j=0;j<=targetn;j++){
        //         System.out.print(dp[i][j]+"  ");
        //     }
        //     System.out.println();
        // }
        return dp[0][0];
        
        
        
        
        // if(m==targetm) return triangle.get(m).get(n);

        // if(dp[m][n]!=-1) return dp[m][n];
        
        // int left=Integer.MAX_VALUE;
        // int right=Integer.MAX_VALUE;
        
        // if(m<targetm){  
        //         System.out.println(m+" left "+n +" :"+triangle.get(m).get(n));
        //         left=findTotal(triangle,m+1,n,targetm,targetn,dp)+triangle.get(m).get(n);
        // }
            
        
        // if(n<targetn)
        // {   System.out.println(m+" right "+n +" :"+triangle.get(m).get(n));
        //     right=findTotal(triangle,m+1,n+1,targetm,targetn,dp)+triangle.get(m).get(n);
        // }
            

        // return dp[m][n]=Math.min(left,right);
    }
}