class RoundRobinCLL {
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

    void run(){
        Node t=head;
        for(int i=0;i<5;i++){
            System.out.println("Process "+t.id);
            t=t.next;
        }
    }

    public static void main(String[] args){
        RoundRobinCLL r=new RoundRobinCLL();
        r.add(1); r.add(2);
        r.run();
    }
}
