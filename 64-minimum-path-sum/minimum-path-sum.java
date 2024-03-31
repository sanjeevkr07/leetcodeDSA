class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp = new int[m][n];
        Arrays.stream(dp).forEach(d->Arrays.fill(d,-1));
        dp[0][0]=grid[0][0];
        return minSum(grid,m-1,n-1,dp);
    }

    public int minSum(int[][] grid,int m,int n,int[][] dp){
        
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 && j==0) continue;
            int up=Integer.MAX_VALUE;
            int left=Integer.MAX_VALUE;
            if(i>0)
                up=dp[i-1][j]+grid[i][j];
            if(j>0)
                left=dp[i][j-1]+grid[i][j];

            dp[i][j]=Math.min(left,up);
            }
        }

        return dp[m][n];

      
    }
}