import java.util.Scanner;
class SubstringCompare {
    static String sub(String s,int start,int end){
        String r="";
        for(int i=start;i<end;i++) r+=s.charAt(i);
        return r;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int st=sc.nextInt(),en=sc.nextInt();
        String a=sub(s,st,en);
        String b=s.substring(st,en);
        System.out.println(a.equals(b));
    }
}
