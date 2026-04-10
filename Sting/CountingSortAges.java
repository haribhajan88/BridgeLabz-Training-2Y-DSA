class CountingSortAges {
    static void sort(int arr[]){
        int max=18;
        int count[] = new int[max+1];
        for(int x:arr) count[x]++;
        int idx=0;
        for(int i=0;i<=max;i++){
            while(count[i]-- > 0){
                arr[idx++] = i;
            }
        }
    }
}
