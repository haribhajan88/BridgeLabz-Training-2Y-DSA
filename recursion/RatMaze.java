class RatMaze {
    static int N=4;
    static boolean solve(int[][] maze,int x,int y){
        if(x==N-1&&y==N-1) return true;
        if(x>=0&&y>=0&&x<N&&y<N&&maze[x][y]==1){
            maze[x][y]=2;
            if(solve(maze,x+1,y)||solve(maze,x,y+1)) return true;
            maze[x][y]=1;
        }
        return false;
    }
    public static void main(String[] args){
        int[][] maze={{1,0,0,0},{1,1,0,1},{0,1,0,0},{1,1,1,1}};
        System.out.println(solve(maze,0,0));
    }
}
