class Solution {
    public void gameOfLife(int[][] board) {

        // 0 0 -> 0
        // 1 1 -> 1
        // 1 0 -> -1
        // 0 1 -> 2
        
        //read each elements

        int m = board.length;
        int n = board[0].length;

        int[][] temp = new int[m][n];

        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ; j<n ;j++){
                
                if(board[i][j]==1){
                    if(checkNeighbors(board,i,j)<2 || checkNeighbors(board,i,j)>3) 
                        board[i][j] = -1;
                }
                else{
                    if(checkNeighbors(board,i,j)==3)
                        board[i][j] = 2;
                }

                

            }
        }

            for(int i = 0 ; i<m ; i++){
                for(int j = 0 ; j<n ;j++){
                    if(board[i][j]==-1) board[i][j]=0;
                    if(board[i][j]==2) board[i][j]=1;
                }
            }
        
    }

    private int checkNeighbors(int[][] board,int i, int j){
        //check all neighbors and return 
        int count = 0;
        int m = board.length;
        int n = board[0].length;

        int[] dx={-1,-1,-1,0,0,1,1,1};
        int[] dy={-1,0,1,-1,1,-1,0,1};

        for(int k=0;k<8;k++){
            int x= i+dx[k];
            int y=j+dy[k];

            if(x>=0 && x<m && y>=0 && y<n){
                if(board[x][y]==1 || board[x][y]==-1){
                    count++;
                }
            }
        }

        return count;
        
    }
}