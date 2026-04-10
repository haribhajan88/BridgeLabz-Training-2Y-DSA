import java.util.Scanner;
class VowelConsonantCount {
    static boolean isVowel(char c){
        c=Character.toLowerCase(c);
        return "aeiou".indexOf(c)!=-1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int v=0,c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)){
                if(isVowel(ch)) v++;
                else c++;
            }
        }
        System.out.println("Vowels="+v+" Consonants="+c);
    }
}
