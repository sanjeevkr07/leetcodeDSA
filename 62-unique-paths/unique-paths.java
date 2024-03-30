class Solution {
    public int uniquePaths(int m, int n) {

        int dp[][]=new int[m][n];
        Arrays.stream(dp).forEach(data->Arrays.fill(data,-1));
        dp[0][0]=1;
        return findUniquePath(m,n,dp);
        
    }

    public int findUniquePath(int m,int n,int[][] dp){
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0) continue;
            int up=0;
            int left=0;
            
                    if(i>0)
                        up=dp[i-1][j];
                    if(j>0)
                        left=dp[i][j-1];

                    dp[i][j]=up+left;
                }
            }
        

        return dp[m-1][n-1];
    }




    // public int findUniquePath(int startm,int startn ,int m,int n){
    //     if(startm==m && startn==n)
    //         return 1;
    //     if(startm>m)  return 0;
    //     if(startn>n)   return 0;
    //     int right=findUniquePath(startm,startn+1,m,n);
    //     int down=findUniquePath(startm+1,startn,m,n);

    //     return right+down;
    // }
}