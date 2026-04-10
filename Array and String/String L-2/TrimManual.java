import java.util.Scanner;
class TrimManual {
    static String trim(String s){
        int start=0,end=s.length()-1;
        while(start<=end && s.charAt(start)==' ') start++;
        while(end>=start && s.charAt(end)==' ') end--;
        String r="";
        for(int i=start;i<=end;i++) r+=s.charAt(i);
        return r;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(trim(s).equals(s.trim()));
    }
}
