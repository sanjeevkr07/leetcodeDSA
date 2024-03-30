class Solution {
    public int uniquePaths(int m, int n) {

        int dp[][]=new int[m+1][n+1];
        Arrays.stream(dp).forEach(data->Arrays.fill(data,-1));
        return findUniquePath(m,n,dp);
        
    }

    public int findUniquePath(int m,int n,int[][] dp){
        if(m==1 && n==1) return 1;
        int up=0;
        int left=0;
        if(dp[m][n]!=-1) return dp[m][n];
        if(m>0)
            up=findUniquePath(m-1,n,dp);
        if(n>0)
            left=findUniquePath(m,n-1,dp);

        return dp[m][n]=up+left;
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