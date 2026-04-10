import java.util.*;
class RockPaperScissors {
    static String[] choice={"rock","paper","scissors"};
    static String comp(){
        return choice[(int)(Math.random()*3)];
    }
    static int winner(String u,String c){
        if(u.equals(c)) return 0;
        if((u.equals("rock")&&c.equals("scissors"))||
           (u.equals("paper")&&c.equals("rock"))||
           (u.equals("scissors")&&c.equals("paper"))) return 1;
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int user=0,comp=0;
        for(int i=0;i<n;i++){
            String u=sc.next();
            String c=comp();
            int w=winner(u,c);
            if(w==1) user++;
            else if(w==-1) comp++;
        }
        System.out.println("User="+user+" Comp="+comp);
    }
}
