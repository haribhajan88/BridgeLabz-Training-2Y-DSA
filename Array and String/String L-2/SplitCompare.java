import java.util.Scanner;
class SplitCompare {
    static String[] split(String s){
        return s.split(" ");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] a=split(s);
        String[] b=s.split(" ");
        System.out.println(a.length==b.length);
    }
}
