class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp = new int[m][n];
        Arrays.stream(dp).forEach(d->Arrays.fill(d,-1));

        return minSum(grid,m-1,n-1,dp);
    }

    public int minSum(int[][] grid,int m,int n,int[][] dp){
        if(m==0 && n==0) return grid[0][0];
        if(dp[m][n]!=-1) return dp[m][n];
        int up=Integer.MAX_VALUE;
        int left=Integer.MAX_VALUE;
        if(m>0)
            up=minSum(grid,m-1,n,dp)+grid[m][n];
        if(n>0)
            left=minSum(grid,m,n-1,dp)+grid[m][n];

        return dp[m][n]=Math.min(left,up);
    }
}