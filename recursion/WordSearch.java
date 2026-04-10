class WordSearch {
    static boolean dfs(char[][] grid,String word,int i,int j,int k){
        if(k==word.length()) return true;
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]!=word.charAt(k)) return false;
        char temp=grid[i][j];
        grid[i][j]='#';
        boolean res=dfs(grid,word,i+1,j,k+1)||dfs(grid,word,i-1,j,k+1)||dfs(grid,word,i,j+1,k+1)||dfs(grid,word,i,j-1,k+1);
        grid[i][j]=temp;
        return res;
    }
    public static void main(String[] args){
        char[][] grid={{'C','A','T','S'},{'O','R','E','A'},{'D','E','A','M'},{'E','L','L','S'}};
        System.out.println(dfs(grid,"DREAM",0,0,0));
    }
}
