class ArrayIndexDemo {
    static void handle(){
        try{
            int[] a={1,2,3};
            System.out.println(a[10]);
        }catch(Exception e){
            System.out.println("Handled");
        }
    }
    public static void main(String[] args){
        handle();
    }
}
