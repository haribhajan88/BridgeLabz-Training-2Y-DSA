class MovieDLL {
    static class Node{
        String title; Node prev,next;
        Node(String t){title=t;}
    }
    Node head;

    void add(String t){
        Node nn=new Node(t);
        if(head!=null){head.prev=nn; nn.next=head;}
        head=nn;
    }

    void display(){
        Node t=head;
        while(t!=null){System.out.println(t.title); t=t.next;}
    }

    public static void main(String[] args){
        MovieDLL m=new MovieDLL();
        m.add("Movie1"); m.add("Movie2");
        m.display();
    }
}
