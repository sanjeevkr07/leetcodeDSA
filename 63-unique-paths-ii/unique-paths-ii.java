class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        if(obstacleGrid[0][0]==1) return 0;
        int dp[][]=new int[m][n];
        Arrays.stream(dp).forEach(d->Arrays.fill(d,-1));
        return findUnique(obstacleGrid,m-1,n-1,dp);
    }
    public int findUnique(int[][] obstacleGrid,int m,int n,int[][] dp){
        if(m==0 && n==0)
            return 1;
        if(obstacleGrid[m][n]==1) return 0;
        int up=0;
        int left=0;

        if(dp[m][n]!=-1) return dp[m][n];
        if(m>0)
            up=findUnique(obstacleGrid,m-1,n,dp);
        if(n>0)
            left=findUnique(obstacleGrid,m,n-1,dp);

        return dp[m][n]=up+left;
    }
}