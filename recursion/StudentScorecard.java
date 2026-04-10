class StudentScorecard {
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<n;i++){
            int p=(int)(Math.random()*100);
            int c=(int)(Math.random()*100);
            int m=(int)(Math.random()*100);
            double per=(p+c+m)/3.0;
            char g='R';
            if(per>=80) g='A';
            else if(per>=70) g='B';
            else if(per>=60) g='C';
            else if(per>=50) g='D';
            else if(per>=40) g='E';
            System.out.println(p+" "+c+" "+m+" "+per+" "+g);
        }
    }
}
