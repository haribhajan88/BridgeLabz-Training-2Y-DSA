class SubsetSum {
    static boolean solve(int[] arr,int i,int sum,int target){
        if(sum==target) return true;
        if(i==arr.length||sum>target) return false;
        if(solve(arr,i+1,sum+arr[i],target)) return true;
        return solve(arr,i+1,sum,target);
    }
    public static void main(String[] args){
        int[] arr={3,4,5};
        System.out.println(solve(arr,0,0,9));
    }
}
