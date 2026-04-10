class StudentSLL {
    static class Node {
        int roll; String name; int age; String grade;
        Node next;
        Node(int r,String n,int a,String g){roll=r;name=n;age=a;grade=g;}
    }
    Node head;

    void add(int r,String n,int a,String g){
        Node nn=new Node(r,n,a,g);
        nn.next=head; head=nn;
    }

    void display(){
        Node t=head;
        while(t!=null){
            System.out.println(t.roll+" "+t.name+" "+t.grade);
            t=t.next;
        }
    }

    public static void main(String[] args){
        StudentSLL s=new StudentSLL();
        s.add(1,"A",20,"A");
        s.add(2,"B",21,"B");
        s.display();
    }
}
