import java.util.Scanner;
class LowercaseCompare {
    static String convert(String s){
        String r="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='A'&&c<='Z') c=(char)(c+32);
            r+=c;
        }
        return r;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(convert(s).equals(s.toLowerCase()));
    }
}
