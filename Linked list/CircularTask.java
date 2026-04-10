class CircularTask {
    static class Node{
        int id; Node next;
        Node(int i){id=i;}
    }
    Node head;

    void add(int id){
        Node nn=new Node(id);
        if(head==null){head=nn; nn.next=head;}
        else{
            Node t=head;
            while(t.next!=head) t=t.next;
            t.next=nn; nn.next=head;
        }
    }

    void display(){
        if(head==null) return;
        Node t=head;
        do{
            System.out.println(t.id);
            t=t.next;
        }while(t!=head);
    }

    public static void main(String[] args){
        CircularTask c=new CircularTask();
        c.add(1); c.add(2);
        c.display();
    }
}
