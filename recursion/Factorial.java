class Factorial {
    static int recursive(int n){
        if(n<=1) return 1;
        return n*recursive(n-1);
    }
    static int iterative(int n){
        int res=1;
        for(int i=2;i<=n;i++) res*=i;
        return res;
    }
    public static void main(String[] args){
        System.out.println(recursive(5));
        System.out.println(iterative(5));
    }
}
